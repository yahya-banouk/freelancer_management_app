package com.freelance.models;

import com.freelance.beans.Client;

import java.util.List;

public interface IClientRepository {
    boolean saveOrUpdate(Client client);

    List<Client> findAll();

    Client findById(Integer id);

    boolean delete(Client client);

    boolean update(Client client);

    Client findByEmail(String email);
}
