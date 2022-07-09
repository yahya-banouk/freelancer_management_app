package com.freelance.models;

import com.freelance.beans.Client;
import com.freelance.beans.Freelancer;
import com.freelance.config.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class ClientRepository extends CrudRepository<Client, Integer> implements IClientRepository {
    public ClientRepository() {
        super(Client.class);
    }

    @Override
    public Client findByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Client.class);
        criteria.add(Restrictions.like("email", email, MatchMode.ANYWHERE));
        List<Client> clients = (List<Client>) criteria.list();
        if (clients.size() != 0) {
            return clients.get(0);
        } else return null;
    }
}
