package backend;

import backend.landingSpots.*;

public class GameManager {

    protected static int numPlayers = 0;
    protected static int cPlayerNum = 0;
    protected static Player players[];
    protected static Player currentPlayer;
    protected static Landable landables[];
    protected static int turn = 1;
    protected static Board board;
    protected static Dice dice;

    public static void initGame() {
        //create players
        //create properties with prices and rents
        createPlayers();
        currentPlayer = players[cPlayerNum];
        board = new Board();
        dice = new Dice();
    }

    public static void setNumPlayers(int num) {
        numPlayers = num;
    }

    public static void createPlayers() {
        players = new Player[numPlayers];
        for (Player player : players) {
            player = new Player();
        }
    }

    public static Player getCurrentPlayer() {
        return players[turn - 1];
    }

    public static void nextTurn() {
        turn++;
        if (turn == numPlayers + 1) {
            turn = 1;
            nextPlayer();
        }
    }

    private static void nextPlayer() {
        cPlayerNum++;
        if (cPlayerNum == numPlayers) {
            cPlayerNum = 0;
        } else if (players[cPlayerNum] == null) {
            nextPlayer();
        }
        currentPlayer = players[cPlayerNum];
    }

    public static void move() {
        int distance = dice.getSum(); //might have to separate to display the distance rolled
        currentPlayer.move(distance);
    }

    public static String removePlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == player) {
                Player removed = players[i];
                players[i] = null;
                return String.format("%s removed.", removed.getName());
            }
        }
        return String.format("%s could not be found.", player.getName());
    }

    public static void getBoardPositions() {
        Board gBoard = Board.getBoardInstance();
        for (Landable spot : gBoard.landables) {
            System.out.println(spot.description());
        }
    }
}
