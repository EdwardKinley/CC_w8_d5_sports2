package db;

import models.Captain;
import models.Player;
import models.Team;
import org.hibernate.Session;

import java.util.List;

public class DBCaptain {

    private static Session session;

    public static List<Player> getPlayersOfCaptainIncludingCaptain(Captain captain) {
        Team team = captain.getTeam();
        return DBTeam.getPlayersOfTeam(team);
    }

    public static List<Player> getPlayersOfCaptainExcludingCaptain(Captain captain) {
        return DBPlayer.getTeammatesOfPlayer(captain);
    }

}
