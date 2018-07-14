package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "competitions")
public class Competition {

    private int id;
    private String name;
    private CompetitionType competitionType;
    private List<Team> teams;

    public Competition() {}

    public Competition(String name, CompetitionType competitionType) {
        this.name = name;
        this.competitionType = competitionType;
    }

    @Enumerated(EnumType.STRING)
    public CompetitionType getCompetitionType() {
        return competitionType;
    }
    public void setCompetitionType(CompetitionType competitionType) {
        this.competitionType = competitionType;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "competition", fetch = FetchType.LAZY)
    public List<Team> getTeams() {
        return teams;
    }
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }


}
