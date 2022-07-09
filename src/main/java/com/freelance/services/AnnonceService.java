package com.freelance.services;

import com.freelance.beans.Annonce;
import com.freelance.beans.Freelancer;
import com.freelance.models.IAnnonceRepository;
import com.freelance.models.IFreelanceRepository;
import com.freelance.utils.AnnonceHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AnnonceService {

    private final IAnnonceRepository annonceRepository;
    private final AnnonceHelper annonceHelper;
    private final IFreelanceRepository freelanceRepository;

    public AnnonceService(IAnnonceRepository annonceRepository,
                          AnnonceHelper annonceHelper, IFreelanceRepository freelanceRepository) {
        this.annonceRepository = annonceRepository;
        this.annonceHelper = annonceHelper;
        this.freelanceRepository = freelanceRepository;
    }

    public void getAllAnnoncesForHome(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Annonce> annonces = annonceRepository.findAll();
        req.setAttribute("annonces", annonces);
        req.getRequestDispatcher("/views/pages/home.jsp").forward(req, res);
    }

    public void getAllAnnoncesForUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        List<Annonce> annonces = annonceRepository.findAll();
        req.setAttribute("annonces", annonces);
        req.getRequestDispatcher("/views/pages/list-services.jsp").forward(req, res);
    }

    public void getAllAnnoncesForProfile(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Freelancer freelancer = (Freelancer) session.getAttribute("currentUser");
        Freelancer freelancer1 = freelanceRepository.findById(freelancer.getId());
        List<Annonce> annonces = freelancer1.getAnnonces();
        req.setAttribute("annonces", annonces);
        req.getRequestDispatcher("/views/pages/profile.jsp").forward(req, res);
    }

    public void getAllAnnoncesForAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        List<Annonce> annonces = annonceRepository.findAll();
        req.setAttribute("annonces", annonces);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("views/pages/annonce-management.jsp").forward(req, res);
    }

    public void getAnnonceForUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            Integer annonceId = Integer.valueOf(req.getParameter("annonceId"));
            Annonce annonce = annonceRepository.findById(annonceId);
            if (annonce != null) {
                req.setAttribute("annonce", annonce);
                req.getRequestDispatcher("views/pages/annonce-page.jsp").forward(req, res);
            } else {
                req.getRequestDispatcher("404.jsp").forward(req, res);
            }
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void getAnnonceForUserProfile(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            Integer annonceId = Integer.valueOf(req.getParameter("annonceId"));
            Annonce annonce = annonceRepository.findById(annonceId);
            if (annonce != null) {
                req.setAttribute("annonce", annonce);
                req.getRequestDispatcher("views/pages/edit-annonce.jsp").forward(req, res);
            } else {
                req.getRequestDispatcher("404.jsp").forward(req, res);
            }
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void getAnnonceForAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            Integer annonceId = Integer.valueOf(req.getParameter("annonceId"));
            Annonce annonce = annonceRepository.findById(annonceId);
            if (annonce != null) {
                req.setAttribute("annonce", annonce);
                req.getRequestDispatcher("annonce-management.jsp").forward(req, res);
            } else {
                req.getRequestDispatcher("404.jsp").forward(req, res);
            }
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void saveOrUpdateAnnonceUser(HttpServletRequest req, HttpServletResponse res,
                                        Annonce annonce)
            throws ServletException, IOException {
        String message = annonceHelper.validateUserInput(annonce);
        if (message == null) {
            boolean annonceCreated = annonceRepository.saveOrUpdate(annonce);
            if (annonceCreated) {
                res.setStatus(201);
                res.sendRedirect("findAllForUserProfile.annonce");
            }
        } else {
            req.setAttribute("errorMessage", message);
            req.getRequestDispatcher("views/pages/create-annonce.jsp").forward(req, res);
        }
    }

    public void saveOrUpdateAnnonceAdmin(HttpServletRequest req, HttpServletResponse res,
                                         Annonce annonce)
            throws ServletException, IOException {
        String message = "Could not create this annonce";
        boolean annonceCreated = annonceRepository.saveOrUpdate(annonce);
        if (annonceCreated) {
            message = "Annonce Created successfully!";
        }
        req.setAttribute("errorMessage", message);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("annonce-management.jsp").forward(req, res);
    }

    public void deleteAnnonceUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            String message = annonceHelper.findByIdAndDelete(req.getParameter("annonceId"));
            req.setAttribute("errorMessage", message);
            req.getRequestDispatcher("findAllForUserProfile.annonce").forward(req, res);
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void deleteAnnonceAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            String message = annonceHelper.findByIdAndDelete(req.getParameter("annonceId"));
            req.setAttribute("errorMessage", message);
            // TODO: replace with appropriate page
            req.getRequestDispatcher("views/pages/annonce-management.jsp").forward(req, res);
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void updateAnnonceUser(HttpServletRequest req, HttpServletResponse res, Annonce annonce)
            throws ServletException, IOException {
        String message = annonceHelper.validateUserInput(annonce);
        if (message != null) {
            req.setAttribute("errorMessage", message);
            req.setAttribute("annonce", annonce);
            req.getRequestDispatcher("views/pages/edit-annonce.jsp").forward(req, res);
        } else {
            annonceHelper.findByIdAndUpdate(annonce.getId(), annonce);
            res.sendRedirect("findAllForUserProfile.annonce");
        }
    }

    public void updateAnnonceAdmin(HttpServletRequest req, HttpServletResponse res, Annonce annonce)
            throws ServletException, IOException {
        String message = null;
        if (annonce.getId() == null) {
            message = "Annonce id cannot be null";
        }
        if (message != null) {
            req.setAttribute("errorMessage", message);
            req.getRequestDispatcher("views/pages/edit-annonce.jsp").forward(req, res);
        }
        message = annonceHelper.findByIdAndUpdate(annonce.getId(), annonce);
        boolean annonceUpdated = annonceRepository.update(annonce);
        if (annonceUpdated) {
            message = "Annonce updated successfully!";
        }
        req.setAttribute("errorMessage", message);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("views/pages/edit-annonce.jsp").forward(req, res);
    }


    public void getAnnonceByName(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String annonceName = req.getParameter("annonceTitle");
            if (annonceName != null) {
                List<Annonce> annonces = annonceRepository.findByTitle(annonceName);
                if (annonces != null) {
                    req.setAttribute("annonces", annonces);
                    req.setAttribute("annonceName", annonceName);
                    req.getRequestDispatcher("views/pages/list-services.jsp").forward(req, res);
                } else {
                    req.getRequestDispatcher("404.jsp").forward(req, res);
                }
            } else {
                List<Annonce> annonces = annonceRepository.findAll();
                if (annonces != null) {
                    req.setAttribute("annonces", annonces);
                    req.getRequestDispatcher("views/pages/list-services.jsp").forward(req, res);
                } else {
                    req.getRequestDispatcher("404.jsp").forward(req, res);
                }
            }

        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void getCreateAnnonce(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("views/pages/create-annonce.jsp").forward(req, res);
    }
}



