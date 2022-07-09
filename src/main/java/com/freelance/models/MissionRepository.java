package com.freelance.models;

import com.freelance.beans.Annonce;
import com.freelance.beans.Mission;
import com.freelance.config.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class MissionRepository extends CrudRepository<Mission , Integer > implements IMissionRepository {
    public MissionRepository()
    {
        super(Mission.class);
    }
    public List<Mission> findByTitle(String title) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Annonce.class);
        criteria.add(Restrictions.like("titre", title, MatchMode.ANYWHERE));
        return (List<Mission>) criteria.list();
    }
}
