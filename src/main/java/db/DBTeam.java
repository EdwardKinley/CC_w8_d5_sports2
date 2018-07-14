package db;

import models.Manager;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DBTeam {

    private static Session session;

    public static Manager getManagerOfTeam(Team team) {
        session = HibernateUtil.getSessionFactory().openSession();
        Manager manager = null;
        try {
            Criteria cr = session.createCriteria(Manager.class);
            cr.add(Restrictions.eq("team", team));
            manager = (Manager) cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return manager;
    }

}
