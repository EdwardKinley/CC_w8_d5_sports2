import db.*;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Competition competition1 = new Competition("CodeClan cup", CompetitionType.CUP);
        Competition competition2 = new Competition("CodeClan league", CompetitionType.LEAGUE);
        DBHelper.save(competition1);
        DBHelper.save(competition2);

        Team team1 = new Team("Edinburgh", competition1);
        Team team2 = new Team("Leeds", competition1);
        Team team3 = new Team("Oxford", competition2);
        DBHelper.save(team1);
        DBHelper.save(team2);
        DBHelper.save(team3);

        Player player1 = new Player("Erin", team1);
        Player player2 = new Player("Colby", team1);
        Player player3 = new Player("Lochlin", team1);
        Player player4 = new Player("Kirree", team2);
        Player player5 = new Player("Ayla", team2);
        Player player6 = new Player("Jamie", team2);
        Player player7 = new Player("Orry", team3);
        Player player8 = new Player("Ethan", team3);
        Player player9 = new Player("Lucy", team3);
        DBHelper.save(player1);
        DBHelper.save(player2);
        DBHelper.save(player3);
        DBHelper.save(player4);
        DBHelper.save(player5);
        DBHelper.save(player6);
        DBHelper.save(player7);
        DBHelper.save(player8);
        DBHelper.save(player9);

        Manager manager1 = new Manager("Jude", team1);
        Manager manager2 = new Manager("Al", team2);
        Manager manager3 = new Manager("Jon", team3);
        DBHelper.save(manager1);
        DBHelper.save(manager2);
        DBHelper.save(manager3);

        Captain captain1 = new Captain("Nick", team1, ArmbandColourType.BLUE);
        Captain captain2 = new Captain("Fia", team2, ArmbandColourType.YELLOW);
        Captain captain3 = new Captain("Caroline", team3, ArmbandColourType.RED);
        DBHelper.save(captain1);
        DBHelper.save(captain2);
        DBHelper.save(captain3);

        Manager team1Manager = DBTeam.getManagerOfTeam(team1);

        List<Player> team1Players = DBTeam.getPlayersOfTeam(team1);

        List<Team> competition1Teams = DBCompetition.getTeamsInCompetition(competition1);

        Competition player1Competition = DBPlayer.getCompetitionForPlayer(player1);
        Competition player4Competition = DBPlayer.getCompetitionForPlayer(player4);
        Competition player7Competition = DBPlayer.getCompetitionForPlayer(player7);

        Competition manager2Competition = DBManager.getCompetitionForManager(manager2);
        Competition manager3Competition = DBManager.getCompetitionForManager(manager3);

        Manager player1Manager = DBPlayer.getManagerOfPlayer(player1);
        Manager player8Manager = DBPlayer.getManagerOfPlayer(player8);

        List<Player> manager1Players = DBManager.getPlayersOfManager(manager1);
        List<Player> manager2Players = DBManager.getPlayersOfManager(manager2);
        List<Player> manager3Players = DBManager.getPlayersOfManager(manager3);

        List<Manager> competition1Managers = DBCompetition.getManagersInCompetition(competition1);
        List<Manager> competition2Managers = DBCompetition.getManagersInCompetition(competition2);

        List<Player> competition1Players = DBCompetition.getPlayersInCompetition(competition1);
        List<Player> competition2Players = DBCompetition.getPlayersInCompetition(competition2);

        List<Player> captain1PlayersIncludingCaptain = DBCaptain.getPlayersOfCaptainIncludingCaptain(captain1);
        List<Player> captain2PlayersIncludingCaptain = DBCaptain.getPlayersOfCaptainIncludingCaptain(captain2);
        List<Player> captain3PlayersIncludingCaptain = DBCaptain.getPlayersOfCaptainIncludingCaptain(captain3);

        List<Player> captain1PlayersExcludingCaptain = DBCaptain.getPlayersOfCaptainExcludingCaptain(captain1);
        List<Player> captain2PlayersExcludingCaptain = DBCaptain.getPlayersOfCaptainExcludingCaptain(captain2);
        List<Player> captain3PlayersExcludingCaptain = DBCaptain.getPlayersOfCaptainExcludingCaptain(captain3);

        List<Player> player5Teammates = DBPlayer.getTeammatesOfPlayer(player5);

        List<Captain> team3Captains = DBTeam.getCaptainsOfTeam(team3);
        Captain team3Captain = DBTeam.getCaptainOfTeam(team3);

//        List<Captain> competition1Captains = DBCaptain.getCaptainsInCompetition(competition1);
//        List<Captain> competition2Captains = DBCaptain.getCaptainsInCompetition(competition2);

    }

}
