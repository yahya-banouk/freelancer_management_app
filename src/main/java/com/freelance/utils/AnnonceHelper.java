package com.freelance.utils;

import com.freelance.beans.Annonce;
import com.freelance.beans.Freelancer;
import com.freelance.models.IAnnonceRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.LinkedList;

public class AnnonceHelper {

    private final IAnnonceRepository annonceRepository;

    public AnnonceHelper(IAnnonceRepository annonceRepository) {
        this.annonceRepository = annonceRepository;
    }

    public String findByIdAndDelete(String id) {
        String errorMessage = "Unable to delete annonce!";
        Integer annonceId = Integer.valueOf(id);
        Annonce annonce = annonceRepository.findById(annonceId);
        if (annonce != null) {
            boolean annonceDeleted = annonceRepository.delete(annonce);
            if (annonceDeleted) {
                errorMessage = "Annonce Deleted Successfully!";
            }
        }
        return errorMessage;
    }

    public Annonce getAnnonceFromUserInput(HttpServletRequest req) {
        HttpSession session = req.getSession();
        Annonce annonce = new Annonce();
        Integer annonceId = null;
        try {
            annonceId = Integer.parseInt(req.getParameter("annonceId"));
        } catch (Exception ignored) {
        }
        String titre = req.getParameter("titre");
        String description = req.getParameter("description");
        LinkedList<String> imageList = new LinkedList<>();
        imageList.add(req.getParameter("image"));
        // VALIDATION!
        if (annonceId != null) {
            annonce.setId(annonceId);
        }
        annonce.setAnnonceImages(imageList);
        annonce.setDescription(description);
        annonce.setTitre(titre);
        annonce.setFreelancer((Freelancer) session.getAttribute("currentUser"));

        return annonce;
    }

    public String validateUserInput(Annonce annonce) {
        String titre = annonce.getTitre();
        String description = annonce.getDescription();
        LinkedList<String> imageList = annonce.getAnnonceImages();
        String message = null;
        if (imageList.get(0) == null || titre == null || description == null) {
            message = "Input fields cannot be null!";
        } else if (titre.isEmpty() || description.isEmpty() || imageList.get(0).isEmpty()) {
            message = "Input fields cannot be empty!";
        }
        return message;
    }

    public String findByIdAndUpdate(Integer id, Annonce annonceUpdated){
        String errorMessage = "Unable to update annonce!";
        Integer annonceId = Integer.valueOf(id);
        Annonce annonceExists = annonceRepository.findById(annonceId);
        if (annonceExists != null) {
            boolean annonceDeleted = annonceRepository.update(annonceUpdated);
            if (annonceDeleted) {
                errorMessage = "Annonce updated Successfully!";
            }
        }
        return errorMessage;
    }
}
