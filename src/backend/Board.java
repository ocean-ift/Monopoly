package backend;

import backend.landingSpots.*;

public class Board { //Singleton pattern
    private static Board board;
    protected Landable[] landables;
    private final static int NUMBER_OF_SQUARES = 40;

    public Board() {
        initBoard();
    }

    public static Board getBoardInstance() {
        if (board == null) {
            board = new Board();
        }
        return board;
    }


    private void initBoard() {
        landables = new Landable[NUMBER_OF_SQUARES];
        landables[0] = new Corner(0);
        for (int i = 1; i < landables.length; i++) {
            if (i % 10 == 0) {
                landables[i] = new Corner(i);
            } else if (i % 5 == 0) {
                landables[i] = new Railroad(i);
            } else if (i == 38 || i == 4) {
                landables[i] = new Tax(i);
            } else if (i == 2 || i == 7 || i == 17 || i == 22 || i == 33 || i == 36) {
                landables[i] = new Chance(); //every time you land on a chance block, generate a random chance card
            } else if (i == 12 || i == 28) {
                landables[i] = new Utility(i);
            } else {
                landables[i] = new Title(i);
            }
        }

    }
}
