package db;

import models.Competition;
import models.Manager;
import models.Player;
import models.Team;
import org.hibernate.Session;

import java.util.List;

public class DBManager {

    private static Session session;

    public static Competition getCompetitionForManager(Manager manager) { return manager.getTeam().getCompetition(); }

    public static List<Player> getPlayersOfManager(Manager manager) {
        Team team = manager.getTeam();
        return DBTeam.getPlayersOfTeam(team);
    }

}
