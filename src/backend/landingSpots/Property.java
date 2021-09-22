package backend.landingSpots;

import backend.Player;

public abstract class Property implements Landable {
    String name;
    int price = 0;
    int rent = 0; //base rent
    boolean owned = false;
    Player owner;

    Property() {
        this.name = null;
    }

    Property(String name, int price, int rent) {
        this.name = name;
        this.price = price;
        this.rent = rent;
    }

    protected void purchase(Player buyer) {
        buyer.getProperties().add(this);
        owned = true;
        owner = buyer;
    };

    public String auction(Player newOwner, int sellingPrice) { //can only be done if owned
        if (owner == null) {
            return String.format("%s cannot be auctioned because it is not curently owned.", name);
        } else {
            owner.getProperties().remove(this);
            newOwner.getProperties().add(this);
            owner = newOwner;
            owner.changeCash(-sellingPrice);
            return String.format("%s successfully sold to %s.", name, owner.getName());
        }
    }

    public int getPrice() {
        return price;
    }

    abstract int getRent(); //determining rent differs based on property type (title vs utility)

    public String getName() {
        return name;
    }

    public String toStringStatus() {
        return String.format("Property %s owned by %s. The rent is currently %d.", name, owner.getName(), rent);
    }
}
