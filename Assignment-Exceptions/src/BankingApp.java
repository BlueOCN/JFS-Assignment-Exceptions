public class BankingApp {
    public static void main(String[] args) {

        // Creating a new bank account and displaying the initial balance.
        BankAccount bankAccount = new BankAccount("Wade Barns", 1000.0);
        bankAccount.displayBalance();

        // Attempting to deposit a negative amount and handling the error.
        try {
            double amount = -999.0;
            System.out.println("\n\033[33mDeposit transaction start.\033[0m");
            System.out.println("\033[1mAmount to deposit: " + amount + "\033[0m");
            bankAccount.depositFunds(amount);
            System.out.println("\033[32;1mDeposit was successful.\033[0m");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\033[33mClosing files and connections.\033[0m");
            System.out.println("\033[33mDeposit transaction end.\033[0m");
        }

        // Withdrawing funds that exceed the current balance and managing the InsufficientFundsException.
        try {
            double amount = 2000.0;
            System.out.println("\n\033[33mWithdrawal transaction start.\033[0m");
            System.out.println("\033[1mAmount to withdraw: " + amount + "\033[0m");
            bankAccount.withdrawFunds(amount);
            System.out.println("\033[32;3mWithdrawal was successful.\033[0m");
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\033[33mClosing files and connections.\033[0m");
            System.out.println("\033[33mWithdrawal transaction end.\033[0m");
        }

        // Completing valid transactions and displaying the updated account balance.
        try {
            double amount = 500.0;
            System.out.println("\n\033[33mDeposit transaction start.\033[0m");
            System.out.println("\033[1mAmount to deposit: " + amount + "\033[0m");
            bankAccount.depositFunds(amount);
            System.out.println("\033[42;1;97mDeposit was successful.\033[0m");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\033[33mClosing files and connections.\033[0m");
            System.out.println("\033[33mDeposit transaction end.\033[0m");
        }

        try {
            double amount = 99.9;
            System.out.println("\n\033[33mWithdrawal transaction start.\033[0m");
            System.out.println("\033[1mAmount to withdraw: " + amount + "\033[0m");
            bankAccount.withdrawFunds(amount);
            System.out.println("\033[42;1;97mWithdrawal was successful.\033[0m");
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\033[33mClosing files and connections.\033[0m");
            System.out.println("\033[33mWithdrawal transaction end.\033[0m");
        }
        bankAccount.displayBalance();
    }
}