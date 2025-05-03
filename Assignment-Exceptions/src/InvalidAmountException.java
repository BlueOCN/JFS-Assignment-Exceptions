public class InvalidAmountException extends Exception {

    // Default constructor
    public InvalidAmountException() {
        super("Invalid amount is entered for deposit or withdrawal. " +
              "Amount must be a positive number and more than zero.");
    }

    // Constructor with custom message
    public InvalidAmountException(String message) {
        super(message);
    }

    // Constructor with cause
    public InvalidAmountException(String message, Throwable cause) {
        super(message, cause);
    }

    // Override toString() for better debugging info
    @Override
    public String toString() {
        return "InvalidAmountException: " + getMessage();
    }
}
