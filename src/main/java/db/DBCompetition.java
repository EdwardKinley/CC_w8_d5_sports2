package db;

import models.*;
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

    public static List<Player> getPlayersInCompetition(Competition competition) {
        List<Team> teams = DBCompetition.getTeamsInCompetition(competition);
        List<Player> players = new ArrayList<Player>();
        for (Team team : teams) { players.addAll(DBTeam.getPlayersOfTeam(team)); }
        return players;
    }

    public static List<Captain> getCaptainsInCompetition(Competition competition) {
        List<Team> teams = DBCompetition.getTeamsInCompetition(competition);
        List<Captain> captains = new ArrayList<Captain>();
        for (Team team : teams) { captains.addAll(DBTeam.getCaptainsOfTeam(team)); }
        return captains;
    }

}
