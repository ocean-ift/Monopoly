package backend.landingSpots;

import backend.*;

public class Railroad extends Property implements Landable { //rent changes based on number of rails owned

    public Railroad(int num) {
        this(num == 5? "Reading Railroad" : num == 15? "Pennsylvania Avenue" : num == 25? "B and O Railroad" : num == 35? "Short Line" : "Unknown");
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
