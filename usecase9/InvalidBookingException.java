package usecase9;

public class InvalidBookingException extends Exception {

    public InvalidBookingException(String message) {
        super(message);
    }
}