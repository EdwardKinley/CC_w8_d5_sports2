package models;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {

    private int id;
    private String name;
    private Team team;

    public Player() {}

    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
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

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }


}
