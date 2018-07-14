package db;

import models.Captain;
import models.Manager;
import models.Player;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

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

    public static List<Player> getPlayersOfTeam(Team team) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Player> players = null;
        try {
            Criteria cr = session.createCriteria(Player.class);
            cr.add(Restrictions.eq("team", team));
            players = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return players;
    }

    public static List<Captain> getCaptainsOfTeam(Team team) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Captain> captains = null;
        try {
            Criteria cr = session.createCriteria(Captain.class);
            cr.add(Restrictions.eq("team", team));
            captains = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return captains;
    }

    public static Captain getCaptainOfTeam(Team team) {
        session = HibernateUtil.getSessionFactory().openSession();
        Captain captain = null;
        try {
            Criteria cr = session.createCriteria(Captain.class);
            cr.add(Restrictions.eq("team", team));
            captain = (Captain) cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return captain;
    }




}
