package com.freelance.utils;

import com.freelance.beans.Annonce;
import com.freelance.beans.Mission;
import com.freelance.models.IMissionRepository;
import jakarta.servlet.http.HttpServletRequest;

import java.util.LinkedList;

public class MissionHelper {
    IMissionRepository missionRepository;
    public MissionHelper(IMissionRepository missionRepository){ this.missionRepository = missionRepository;}

    public String findByIdAndDelete(String id)
    {
        String errorMessage = "Unable to delete mission";
        Integer missionId = Integer.valueOf(id);
        Mission mission = missionRepository.findById(missionId);
        if(mission != null)
        {
            boolean missionDeleted = missionRepository.delete(mission);
            if(missionDeleted)
            {
                errorMessage = "Mission Deleted Successfully";
            }
        }
        return errorMessage;
    }

    public Mission getMissionFromUserInput(HttpServletRequest req)
    {
        Mission mission = new Mission();

        Integer missionId = null ;

        try {
            missionId = Integer.parseInt(req.getParameter("missionId"));
        }catch( Exception ignored)
        {
        }
        String titre = req.getParameter("titre");
        String discription = req.getParameter("discription");
        LinkedList<String> imageList = new LinkedList<>();
        imageList.add(req.getParameter("image"));
        if(missionId != null)
        {
            mission.setId(missionId);
        }
        mission.setMissionImages(imageList);
        mission.setDescription(discription);
        mission.setTitre(titre);

        return mission;


    }


    public String validateUserInput(Mission mission)
    {
        String titre = mission.getTitre();
        String description = mission.getDescription();
        LinkedList<String> imageList = mission.getMissionImages();
        String message = null ;

        if( imageList.get(0) == null || titre == null || description == null)
        {
            message = "Input fields cannot be null!";

        } else if (titre.isEmpty() || description.isEmpty() || imageList.get(0).isEmpty()) {
            message = "Input fields cannot be empty!";
        }
        return  message;
    }


    public String findByIdAndUpdate(Integer id , Mission missionUpdated )
    {
        String errorMessage = "Unable to update mission!";
        Integer missionId = Integer.valueOf(id);
        Mission missionExists = missionRepository.findById(missionId);
        if (missionExists != null) {
            boolean missionDeleted = missionRepository.update(missionUpdated);
            if (missionDeleted) {
                errorMessage = "Mission updated Successfully!";
            }
        }


        return errorMessage ;
    }
















}
