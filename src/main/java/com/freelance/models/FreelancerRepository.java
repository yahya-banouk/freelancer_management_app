package com.freelance.models;

import com.freelance.beans.Annonce;
import com.freelance.beans.Freelancer;
import com.freelance.config.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class FreelancerRepository extends CrudRepository<Freelancer, Integer> implements IFreelanceRepository {

    public FreelancerRepository() {
        super(Freelancer.class);
    }

    @Override
    public Freelancer findByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Freelancer.class);
        criteria.add(Restrictions.like("email", email, MatchMode.ANYWHERE));
        List<Freelancer> freelancers = (List<Freelancer>) criteria.list();
        if (freelancers.size() != 0) {
            return freelancers.get(0);
        } else return null;
    }
}
