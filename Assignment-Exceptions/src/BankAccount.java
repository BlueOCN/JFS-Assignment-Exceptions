import java.util.UUID;


public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(){
        this.accountNumber = UUID.randomUUID().toString();
        this.accountHolder = "NA";
        this.balance = 0.0;
    }

    BankAccount(String accountHolder, double balance) {
        this.accountNumber = UUID.randomUUID().toString();
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayBalance(){
        System.out.println("\n\033[1mHi "+ this.accountHolder+"! This is your balance: \033[0m\033[47;1;97m" + this.balance +  "\033[0m");
    }

    public void depositFunds(double amount) throws InvalidAmountException {
        if(amount <= 0){
            throw new InvalidAmountException("\033[41;1;97mDeposited funds cannot be negative or zero.\033[0m");
        }
        this.balance += amount;
    }

    public void withdrawFunds(double amount) throws InvalidAmountException, InsufficientFundsException {
        if(amount <= 0){
            throw new InvalidAmountException("\033[41;1;97mDeposited funds cannot be negative or zero.\033[0m");
        }
        if(amount > this.balance){
            throw new InsufficientFundsException("\033[41;1;97mInsufficient funds on the account.\033[0m");
        }
        this.balance -= amount;
    }
}

