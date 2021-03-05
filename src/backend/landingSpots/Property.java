package backend.landingSpots;

public abstract class Property {
    String name;
    int price = 0;
    int rent = 0; //base rent

    Property(String name, int price, int rent) {
        this.price = price;
        
    }

    abstract void purchase();

    abstract void auction();

    public int getPrice() {
        return price;
    }

    abstract int getRent(); //determining rent differs based on property type (title vs utility)

    public String getName() {
        return name;
    }
}
