package bankAccount;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Private attributes
    private final String accountNumber;
    private double balance;
    private final int pin;
    private final List<String> transactionHistory;

    // Constructor
    public Bank(String accountNumber, double initialBalance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: " + initialBalance + " MAD");
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Verify PIN
    public boolean verifyPin(int inputPin) {
        return this.pin == inputPin;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " MAD");
            System.out.println(" " + amount + " MAD deposited successfully.");
        } else {
            System.out.println(" Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Withdrawal amount must be positive.");
            return;
        }

        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + " MAD");
            System.out.println(" " + amount + " MAD withdrawn successfully.");
        } else {
            System.out.println(" Insufficient balance.");
        }
    }

    // Display transaction history
    public void showTransactionHistory() {
        System.out.println("\n TRANSACTION HISTORY:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String record : transactionHistory) {
                System.out.println("- " + record);
            }
        }
    }
}
