package backend.landingSpots;

public class Title extends Property implements Landable {

    public Title(String name, int price, int rent) {
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
