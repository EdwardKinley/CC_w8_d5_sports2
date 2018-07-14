package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "competitions")
public class Competition {

    private int id;
    private String name;
    private String type;
    private List<Team> teams;

    public Competition() {}

    public Competition(String name, String type) {
        this.name = name;
        this.type = type;
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

    @Column(name = "type")
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @OneToMany(mappedBy = "competition", fetch = FetchType.LAZY)
    public List<Team> getTeams() {
        return teams;
    }
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }


}
