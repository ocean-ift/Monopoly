package backend.landingSpots;

public class Business extends Property implements Landable {

    public Business(String name, int price, int rent) {
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
