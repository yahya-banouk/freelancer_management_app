package com.freelance.controllers;

import com.freelance.beans.Annonce;
import com.freelance.models.AnnonceRepository;
import com.freelance.models.FreelancerRepository;
import com.freelance.models.IAnnonceRepository;
import com.freelance.models.IFreelanceRepository;
import com.freelance.services.AnnonceService;
import com.freelance.utils.AnnonceHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AnnonceController",
        description = "Servlet that handles all **Annonce** requests related",
        value = "*.annonce")
public class AnnonceController extends HttpServlet {

    private AnnonceService annonceService;
    private AnnonceHelper annonceHelper;

    @Override
    public void init() throws ServletException {
        IAnnonceRepository annonceRepository = new AnnonceRepository();
        IFreelanceRepository freelanceRepository = new FreelancerRepository();
        annonceHelper = new AnnonceHelper(annonceRepository);
        annonceService = new AnnonceService(annonceRepository, annonceHelper, freelanceRepository);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // TODO: Check authorization session!
        res.setContentType("text/html");
        String requestPath = req.getServletPath();

        switch (requestPath) {
            case "/findAllForHome.annonce":
                annonceService.getAllAnnoncesForHome(req, res);
                break;
            case "/findAllForUserProfile.annonce":
                annonceService.getAllAnnoncesForProfile(req, res);
                break;
            case "/findAllForUser.annonce":
                annonceService.getAllAnnoncesForUser(req, res);
                break;
            case "/findAllForAdmin.annonce":
                annonceService.getAllAnnoncesForAdmin(req, res);
                break;
            case "/findAnnoncesByName.annonce":
                annonceService.getAnnonceByName(req, res);
                break;
            case "/findOneForUser.annonce":
                annonceService.getAnnonceForUser(req, res);
                break;
            case "/createOneForUser.annonce":
                annonceService.getCreateAnnonce(req, res);
                break;
            case "/findOneForUserProfile.annonce":
                annonceService.getAnnonceForUserProfile(req, res);
                break;
            case "/findOneForAdmin.annonce":
                annonceService.getAnnonceForAdmin(req, res);
                break;
            case "/deleteForUser.annonce":
                annonceService.deleteAnnonceUser(req, res);
                break;
            case "/deleteForAdmin.annonce":
                annonceService.deleteAnnonceAdmin(req, res);
                break;
            default:
                req.getRequestDispatcher("404.jsp").forward(req, res);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        // TODO: Check authorization session!
        String requestPath = req.getServletPath();
        Annonce annonce = annonceHelper.getAnnonceFromUserInput(req);
        switch (requestPath) {
            case "/saveAnnonceForUser.annonce":
                annonceService.saveOrUpdateAnnonceUser(req, res, annonce);
                break;
            case "/saveAnnonceForAdmin.annonce":
                annonceService.saveOrUpdateAnnonceAdmin(req, res, annonce);
                break;
            case "/updateForAdmin.annonce":
                annonceService.updateAnnonceAdmin(req, res, annonce);
                break;
            case "/updateForUser.annonce":
                annonceService.updateAnnonceUser(req, res, annonce);
                break;
        }

    }
}
