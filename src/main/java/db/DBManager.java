package db;

import models.Competition;
import models.Manager;
import org.hibernate.Session;

public class DBManager {

    private static Session session;

    public static Competition getCompetitionForManager(Manager manager) { return manager.getTeam().getCompetition(); }

}
