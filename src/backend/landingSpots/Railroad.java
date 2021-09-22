package backend.landingSpots;

import backend.*;

public class Railroad extends Property implements Landable { //rent changes based on number of rails owned

    public Railroad(int num) {
        this(num == 5? "Rail 1" : num == 15? "Rail 2" : num == 25? "Rail 3" : num == 35? "Rail 4" : "Unknown");
    }

    private Railroad(String name) {
        super(name, 150, 50);
    }

    @Override
    public int getRent() { //based on how many rails the player owns
        Player current = GameManager.getCurrentPlayer();
        int count = 0;
        for (Property prop : current.getProperties()) {
            if (prop instanceof Railroad) {
                count++;
            }
        }
        return switch (count) {
            case 1 -> 50;
            case 2 -> 100;
            case 3 -> 150;
            case 4 -> 200;
            default -> 0;
        };
    }
}
