package db;

import models.Competition;
import models.Manager;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class DBCompetition {

    private static Session session;

    public static List<Team> getTeamsInCompetition(Competition competition) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Team> teams = null;
        try {
            Criteria cr = session.createCriteria(Team.class);
            cr.add(Restrictions.eq("competition", competition));
            teams = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return teams;
    }

    public static List<Manager> getManagersInCompetition(Competition competition) {
        List<Team> teams = DBCompetition.getTeamsInCompetition(competition);
        List<Manager> managers = new ArrayList<Manager>();
        for (Team team : teams) { managers.add(DBTeam.getManagerOfTeam(team)); }
        return managers;
    }

}
