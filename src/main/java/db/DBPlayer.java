package db;

import models.Competition;
import models.Player;

public class DBPlayer {

    public static Competition getCompetitionForPlayer(Player player) { return player.getTeam().getCompetition(); }

}
