package backend.exceptions;

public class PlayerDoesNotHavePropertyException extends RuntimeException {
    public PlayerDoesNotHavePropertyException(String message) {
        super(message);
    }
}
