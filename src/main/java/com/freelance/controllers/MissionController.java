package com.freelance.controllers;

import com.freelance.beans.Annonce;
import com.freelance.beans.Mission;
import com.freelance.models.AnnonceRepository;
import com.freelance.models.IAnnonceRepository;
import com.freelance.models.IMissionRepository;
import com.freelance.models.MissionRepository;
import com.freelance.services.AnnonceService;
import com.freelance.services.MissionService;
import com.freelance.utils.AnnonceHelper;
import com.freelance.utils.MissionHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MissionController",
        description = "Servlet that handles all **Mission** requests related",
        value = "*.mission")
public class MissionController extends HttpServlet {
    private MissionService missionService;
    private MissionHelper missionHelper;

    @Override
    public void init() throws ServletException {
        IMissionRepository missionRepository = new MissionRepository();
        missionHelper = new MissionHelper(missionRepository);
        missionService = new MissionService(missionRepository, missionHelper);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // TODO: Check authorization session!
        res.setContentType("text/html");
        String requestPath = req.getServletPath();

        switch (requestPath) {
            case "/findAllForHome.mission":
                missionService.getAllMissionsForHome(req, res);
                break;
            case "/findAllForUserProfile.mission":
                missionService.getAllMissionsForProfile(req, res);
                break;
            case "/findAllForUser.mission":
                missionService.getAllMissionsForUser(req, res);
                break;
            case "/findAllForAdmin.mission":
                missionService.getAllMissionsForAdmin(req, res);
                break;
            case "/findAnnoncesByName.mission":
                missionService.getMissionByName(req, res);
                break;
            case "/findOneForUser.mission":
               missionService.getMissionForUser(req, res);
                break;
            case "/createOneForUser.mission":
                missionService.getCreateMission(req, res);
                break;
            case "/findOneForUserProfile.mission":
                missionService.getMissionForUserProfile(req, res);
                break;
            case "/findOneForAdmin.mission":
                missionService.getMissionForAdmin(req, res);
                break;
            case "/deleteForUser.mission":
                missionService.deleteMissionUser(req, res);
                break;
            case "/deleteForAdmin.mission":
                missionService.deleteMissionAdmin(req, res);
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
        Mission mission = missionHelper.getMissionFromUserInput(req);
        switch (requestPath) {
            case "/saveMissionForUser.mission":
                missionService.saveOrUpdateMissionUser(req, res, mission);
                break;
            case "/saveMissionForAdmin.mission":
                missionService.saveOrUpdateMissionAdmin(req, res, mission);
                break;
            case "/updateForAdmin.mission":
                missionService.updateMissionAdmin(req, res, mission);
                break;
            case "/updateForUser.mission":
                missionService.updateMissionUser(req, res, mission);
                break;
        }

    }
}
