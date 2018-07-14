package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "captains")
public class Captain extends Player {

    private ArmbandColourType armbandColourType;

    public Captain() {}

    public Captain(String name, Team team, ArmbandColourType armbandColourType) {
        super(name, team);
        this.armbandColourType = armbandColourType;
    }

    @Enumerated(EnumType.STRING)
    public ArmbandColourType getArmbandColourType() {
        return armbandColourType;
    }
    public void setArmbandColourType(ArmbandColourType armbandColourType) {
        this.armbandColourType = armbandColourType;
    }
}
