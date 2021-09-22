package backend.landingSpots;

import java.util.Random;

public class Chance implements Landable {

    private final static int NUM_CHANCE_CARDS = 40;

    private String message;

    public Chance() {
         this.message = getCard();
    }

    private String getCard() {
        Random rand = new Random();
        int card = rand.nextInt(NUM_CHANCE_CARDS);
        return switch (card) { //adjust to send out 40 possible messages
            case 0 -> "Chance 0";
            case 1 -> "Chance 1";
            case 2 -> "Chance 2";
            default -> "Chance default";
        };
    }

    public String getMessage() {
        return message;
    }
}
