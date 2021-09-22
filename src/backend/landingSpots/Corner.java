package backend.landingSpots;

public class Corner implements Landable {
    int type;

    public Corner(int type) {
        this.type = type;
    }

    public String getType() {
        return switch (type) {
            case 0 -> "go";
            case 10 -> "in jail";
            case 20 -> "park";
            case 30 -> "go to jail";
            default -> "Unknown";
        };
    }
}
