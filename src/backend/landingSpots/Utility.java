package backend.landingSpots;

import backend.Player;

public class Utility extends Property implements Landable {

    public Utility(int num) {
        this(num == 12? "Electric Company" : num == 28? "Water Company" : "Unknown");
    }

    public Utility(String name) {
        super(name, 150, 20);
    }

    @Override
    int getRent() {
        return 0;
    }

    @Override
    public String description() {
        return this.name;
    }
}
