import db.DBHelper;
import models.Competition;
import models.Manager;
import models.Player;
import models.Team;

public class Runner {

    public static void main(String[] args) {

        Competition competition1 = new Competition("CodeClan cup", "cup");
        DBHelper.save(competition1);

        Team team1 = new Team("Edinburgh");
        Team team2 = new Team("Leeds");
        Team team3 = new Team("Oxford");
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

    }

}
