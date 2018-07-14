package db;

import models.Competition;
import models.Manager;
import models.Player;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBPlayer {

    private static Session session;

    public static Competition getCompetitionForPlayer(Player player) { return player.getTeam().getCompetition(); }

    public static Manager getManagerOfPlayer(Player player) {
        Team team = player.getTeam();
        return DBTeam.getManagerOfTeam(team);
    }

    public static List<Player> getTeammatesOfPlayer(Player player) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Player> players = null;
        try {
            Criteria cr = session.createCriteria(Player.class);
            cr.add(Restrictions.eq("team", player.getTeam()));
            cr.add(Restrictions.ne("id", player.getId()));
            players = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return players;
    }

}
