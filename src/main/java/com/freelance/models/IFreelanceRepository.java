package com.freelance.models;

import com.freelance.beans.Annonce;
import com.freelance.beans.Freelancer;

import java.util.List;

public interface IFreelanceRepository {

    boolean saveOrUpdate(Freelancer freelancer);

    List<Freelancer> findAll();

    Freelancer findById(Integer id);

    boolean delete(Freelancer freelancer);

    boolean update(Freelancer freelancer);

    Freelancer findByEmail(String email);
}
