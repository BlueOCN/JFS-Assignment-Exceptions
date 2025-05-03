# JFS-Assignment-Exceptions
Design a simple banking application that manages customer accounts. The application should allow users to perform basic operations such as checking balances, depositing funds, and withdrawing funds. Your program must handle various exceptions, ensuring that errors are managed gracefully and do not cause the application to crash.

### Assignment Objective:

To apply your understanding of exception handling in Java by designing and implementing a small Java application that demonstrates how to effectively manage errors using try-catch blocks, custom exceptions, and proper resource management. By completing this assignment, you will demonstrate your ability to write robust Java code that gracefully handles errors, improving the user experience and stability of your application.

### Problem Statement:

Design a simple banking application that manages customer accounts. The application should allow users to perform basic operations such as checking balances, depositing funds, and withdrawing funds. Your program must handle various exceptions, ensuring that errors are managed gracefully and do not cause the application to crash.

---

## Requirements:

### Classes and Exceptions:

- Create a class BankAccount with attributes such as accountNumber, accountHolder, and balance.
- Implement methods for checking balance, depositing funds, and withdrawing funds.
- Define custom exceptions InsufficientFundsException and InvalidAmountException to handle specific error scenarios.

### Exception Handling:

- Use try-catch blocks to handle scenarios where an invalid amount (e.g., negative or zero) is entered for deposit or withdrawal.
- Throw an InsufficientFundsException if the withdrawal amount exceeds the account balance, and handle it with an appropriate error message.
- Use the throws keyword in method signatures where appropriate, declaring which methods can throw exceptions.
- Ensure proper resource management by using finally blocks where necessary (e.g., closing files or connections if the application involves data storage).

## Implementation:

Write a main class BankingApp with a main method to demonstrate the functionality of your banking application. 

### Implement methods to:

- Create new bank accounts.
- Display account balances.
- Deposit funds into accounts, handling errors for invalid amounts.
- Withdraw funds from accounts, handling errors for insufficient funds and invalid amounts.

### Sample Output:

The main method should demonstrate the following scenarios:

- Creating a new bank account and displaying the initial balance.
- Attempting to deposit a negative amount and handling the error.
- Withdrawing funds that exceed the current balance and managing the InsufficientFundsException.
- Completing valid transactions and displaying the updated account balance.
