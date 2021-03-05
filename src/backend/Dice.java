package backend;

import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        this.value = 1;
    }

    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }
}
