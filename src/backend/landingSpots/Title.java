package backend.landingSpots;

import backend.Player;

public class Title extends Property implements Landable {

    public Title(int num) {
        this("" + num, 100, 100);
    }

    public Title(String name, int price, int rent) {
        super(name, price, rent);
    }

    @Override
    int getRent() {
        return 0;
    }
}
