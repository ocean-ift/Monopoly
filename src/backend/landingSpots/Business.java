package backend.landingSpots;

import backend.Player;

public class Business extends Property implements Landable {

    public Business(String name, int price, int rent) {
        super(name, price, rent);
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
