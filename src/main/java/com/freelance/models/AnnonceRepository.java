package com.freelance.models;

import com.freelance.beans.Annonce;
import com.freelance.config.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class AnnonceRepository extends CrudRepository<Annonce, Integer> implements IAnnonceRepository {

    public AnnonceRepository() {
        super(Annonce.class);
    }


    @Override
    public List<Annonce> findByTitle(String title) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Annonce.class);
        criteria.add(Restrictions.like("titre", title, MatchMode.ANYWHERE));
        return (List<Annonce>) criteria.list();
    }

    @Override
    public List<Annonce> findByFreelancerId(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Annonce.class);
        criteria.add(Restrictions.like("freelancer", String.valueOf(id), MatchMode.ANYWHERE));
        return (List<Annonce>) criteria.list();
    }
}
