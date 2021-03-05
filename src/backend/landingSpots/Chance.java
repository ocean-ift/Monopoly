package backend.landingSpots;

public class Chance implements Landable {
    private String message;

    public Chance(String message) {
        this.message = message; //switch-case for diff messages
    }
}
