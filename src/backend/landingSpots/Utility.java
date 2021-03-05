package backend.landingSpots;

public class Utility extends Property implements Landable {

    public Utility(String name, int price, int rent) {
        super(name, price, rent);
    }

    @Override
    public void purchase() {

    }

    @Override
    public void auction() {

    }

    @Override
    int getRent() {
        return 0;
    }
}
