package backend.landingSpots;

import backend.GameManager;
import backend.Player;

import java.util.Random;

public class Chance implements Landable {

    private final static int NUM_CHANCE_CARDS = 40;
    private final static int NUM_MESSAGES = 16;

    private Player current;

    private String message;

    public Chance() {
         this.message = getCard();
    }

    private String getCard() {
        Random rand = new Random();
        int card = rand.nextInt(NUM_MESSAGES);
        current = GameManager.getCurrentPlayer();

        switch (card) {
            case 0 : //go to GO
                handleAction("200", current);
                return "Advance to GO and collect 200!";
            case 1 : //go to illinois
                if (current.getPosition() > 24) {
                    handleAction("200", current);
                }
                handleAction("illinois ave", current);
                return "Advance to Illinois Avenue. If you pass GO, collect 200.";
            case 2 : //go to charles
                if (current.getPosition() > 11) {
                    handleAction("200", current);
                }
                handleAction("charles", current);
                return "Advance to St Charles Place. If you pass go, collect 200.";
            case 3 : //go to nearest util
                handleAction("util", current);
                return "Advance token to nearest Utility. If unowned, you may buy it from the Bank. If unowned, roll dice and pay owner ten times the amount rolled.";
            default :
                return null;
        }
    }

    private void handleAction(String s, Player current) {
        switch (s) {
            case "200" :
                current.addCash(200);
            case "illinois ave" :
                current.setPosition(24);
            case "charles" :
                current.setPosition(11);

        }
    }

    public void handleUtil(Player current) {

    }

    public String getMessage() {
        return message;
    }

    @Override
    public String description() {
        return getMessage();
    }
}
