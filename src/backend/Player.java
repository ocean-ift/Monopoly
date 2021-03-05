package backend;

import backend.exceptions.PlayerDoesNotHavePropertyException;
import backend.landingSpots.Property;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int cash;
    private ArrayList<Property> properties = new ArrayList<>();

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

    public List<Property> getProperties() {
        return properties;
    }
}
