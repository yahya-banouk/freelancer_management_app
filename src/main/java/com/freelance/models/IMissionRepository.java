package com.freelance.models;

import com.freelance.beans.Annonce;
import com.freelance.beans.Mission;

import java.util.List;

public interface IMissionRepository {
    boolean saveOrUpdate(Mission mission);

    List<Mission> findAll();

    Mission findById(Integer id);

    boolean delete(Mission mission);

    boolean update(Mission mission);

    List<Mission> findByTitle(String title);

}
