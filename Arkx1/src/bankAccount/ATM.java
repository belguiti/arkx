package bankAccount;
import java.util.Scanner;

public class ATM {
    private final Bank account;
    private final Scanner scanner;

    public ATM(Bank account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    // Verify PIN before each operation
    private boolean verifyAccess() {
        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();
        if (account.verifyPin(enteredPin)) {
            return true;
        } else {
            System.out.println(" Incorrect PIN. Access denied.");
            return false;
        }
    }

    // Start ATM operations
    public void start() {
        System.out.println("Account loaded successfully!");
        showMenu();
    }

    private void showMenu() {
        int choice = 0;
        do {
            System.out.println("\n===========================");
            System.out.println("       ATM MAIN MENU       ");
            System.out.println("===========================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println(" Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (verifyAccess()) {
                        System.out.println(" Your balance is: " + account.getBalance() + " MAD");
                    }
                    break;

                case 2:
                    if (verifyAccess()) {
                        System.out.print("Enter amount to deposit: ");
                        if (scanner.hasNextDouble()) {
                            double amount = scanner.nextDouble();
                            account.deposit(amount);
                        } else {
                            System.out.println(" Invalid amount.");
                            scanner.next();
                        }
                    }
                    break;

                case 3:
                    if (verifyAccess()) {
                        System.out.print("Enter amount to withdraw: ");
                        if (scanner.hasNextDouble()) {
                            double amount = scanner.nextDouble();
                            account.withdraw(amount);
                        } else {
                            System.out.println(" Invalid amount.");
                            scanner.next();
                        }
                    }
                    break;

                case 4:
                    if (verifyAccess()) {
                        account.showTransactionHistory();
                    }
                    break;

                case 5:
                    System.out.println(" Thank you for using our ATM. Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid choice. Please try again.");
            }

        } while (choice != 5);
    }
}
