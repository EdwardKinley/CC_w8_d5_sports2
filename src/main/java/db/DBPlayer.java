package db;

import models.Competition;
import models.Manager;
import models.Player;
import models.Team;

public class DBPlayer {

    public static Competition getCompetitionForPlayer(Player player) { return player.getTeam().getCompetition(); }

    public static Manager getManagerOfPlayer(Player player) {
        Team team = player.getTeam();
        return DBTeam.getManagerOfTeam(team);
    }

}
