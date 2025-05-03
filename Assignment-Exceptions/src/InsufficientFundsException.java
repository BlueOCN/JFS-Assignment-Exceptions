public class InsufficientFundsException extends Exception {

    // Default constructor
    public InsufficientFundsException() {
        super("Insufficient funds in account.");
    }

    // Constructor with custom message
    public InsufficientFundsException(String message) {
        super(message);
    }

    // Constructor with cause
    public InsufficientFundsException(String message, Throwable cause) {
        super(message, cause);
    }

    // Override toString() for better debugging info
    @Override
    public String toString() {
        return "InsufficientFundsException: " + getMessage();
    }
}
