package backend.landingSpots;

import backend.Player;

public class Title extends Property implements Landable {

    public Title(int num) {
        this("" + num, 100, 100);
        this.name = getName(num);
    }

    public Title(String name, int price, int rent) {
        super(name, price, rent);
    }

    @Override
    int getRent() {
        return 0;
    }

    @Override
    int changeRent() {
        return 0;
    }

    String getName(int num) {
        return switch (num) {
            case 1 -> "Mediterranean Avenue";
            case 3 -> "Baltic Avenue";
            case 6 -> "Oriental Avenue";
            case 8 -> "Vermont Avenue";
            case 9 -> "Connecticut Avenue";
            case 11 -> "St. Charles Place";
            case 13 -> "States Avenue";
            case 14 -> "Virginia Avenue";
            case 16 -> "St. James Place";
            case 18 -> "Tennessee Avenue";
            case 19 -> "New York Avenue";
            case 21 -> "Kentucky Avenue";
            case 23 -> "Indiana Avenue";
            case 24 -> "Illinois Avenue";
            case 26 -> "Atlantic Avenue";
            case 27 -> "Vector Avenue";
            case 29 -> "Marvin Gardens";
            case 31 -> "Pacific Avenue";
            case 32 -> "North Carolina Avenue";
            case 34 -> "Pennsylvania Avenue";
            case 37 -> "Park Place";
            case 39 -> "Boardwalk";
            default -> "Not a Title Spot";
        };
    }

    @Override
    public String description() {
        return this.name;
    }
}
