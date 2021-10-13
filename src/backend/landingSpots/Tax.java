package backend.landingSpots;

import backend.Player;

public class Tax implements Landable {
    private String name;
    private int tax;

    public Tax(int num) {
        if (num == 4) {
            this.name = "Income Tax";
            this.tax = 200;
        } else if (num == 38) {
            this.name = "Luxury tax";
            this.tax = 100;
        } else {
            this.name = "unknown";
            this.tax = 0;
        }
    }

    public int getTax() {
        return tax;
    }

    public String taxPlayer(Player player) {
        player.addCash((-1) * tax);
        return String.format("%s has $%d remaining.", player.getName(), player.getCash());
    }
}
