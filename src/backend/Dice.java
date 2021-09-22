package backend;

import java.util.Random;

public class Dice {
    private int fValue;
    private int sValue;

    public Dice() {
        this.fValue = 1;
        this.sValue = 1;
    }

    private void roll() {
        Random rand = new Random();
        fValue = rand.nextInt(6) + 1;
        sValue = rand.nextInt(6) + 1;
    }

    public int getSum() {
        roll();
        return fValue + sValue;
    }

    public int getfValue() {
        return fValue;
    }

    public int getsValue() {
        return sValue;
    }
}
