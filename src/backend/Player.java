package backend;

import backend.exceptions.PlayerDoesNotHavePropertyException;
import backend.landingSpots.Property;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int cash;
    private ArrayList<Property> properties;
    private int position; //ranges from 0 (go) to 39 (second blue property)

    Player (String name) {
        this.name = name;
        this.cash = 1500;
        this.properties = new ArrayList<>();
        this.position = 0;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public void removeCash(int cash) {
        this.cash -= cash;
    }

    public int getCash() {
        return cash;
    }

    public void addProp(Property property) {
        properties.add(property);
    }

    public void removeProp(Property property) {
        properties.remove(property);
    }

    public Property getProperty(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Cannot accept null name.");
        }
        Property property = null;
        for (int i = 0; i < properties.size(); i++) {
            Property curr = properties.get(i);
            if (name.equals(curr.getName())) {
                property = curr;
            }
        }
        if (property == null) {
            throw new PlayerDoesNotHavePropertyException(this.name + "does not " +
                    "have " + name + ".");
        } else {
            return property;
        }
    }

    public void move(int distance) {
        if (this.position + distance > 39) {
            this.position = distance - (39 - this.position) - 1;
            this.cash += 200;
        } else {
            this.position += distance;
        }
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeCash(int diff) {
        cash += diff;
        if (cash < 1) {
            System.out.println(GameManager.removePlayer(this));
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String status() {
        return String.format("Player %s on spot %d with %d properties and %d dollars",
                this.name,
                this.position,
                this.properties.size(),
                this.cash);
    }
}
