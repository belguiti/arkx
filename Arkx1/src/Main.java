import java.util.Scanner;
import bankAccount.*;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== WELCOME TO THE ATM SYSTEM ======");
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter your initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Set your 4-digit PIN: ");
        int pin = scanner.nextInt();

        // Create the BankAccount object
        Bank account = new Bank(accountNumber, initialBalance, pin);

        // Start the ATM
        ATM atm = new ATM(account);
        atm.start();

        scanner.close();
    }
}



//        Bank account = new Bank("123456", 1000.0);
//
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("\n###################");
//            System.out.println("CHOOSE YOUR OPERATION:");
//            System.out.println("1 : BALANCE");
//            System.out.println("2 : DEPOSIT");
//            System.out.println("3 : WITHDRAW");
//            System.out.println("4 : EXIT");
//            System.out.print("Enter your choice: ");
//
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("YOUR BALANCE: " + account.getBalance());
//                    break;
//
//                case 2:
//                    System.out.print("ENTER AMOUNT TO DEPOSIT: ");
//                    double deposit = scanner.nextDouble();
//                    account.deposit(deposit);
//                    break;
//
//                case 3:
//                    System.out.print("ENTER AMOUNT TO WITHDRAW: ");
//                    double withdraw = scanner.nextDouble();
//                    account.withdraw(withdraw);
//                    break;
//
//                case 4:
//                    System.out.println("Thank you! Goodbye.");
//                    break;
//
//                default:
//                    System.out.println("INVALID INPUT. Please try again.");
//                    break;
//            }
//        } while (choice != 4);
//
//        scanner.close();
//    }
//}


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number 1: ");
//        int number1 = scanner.nextInt();
//        System.out.print("Enter a number 2: ");
//        int number2 = scanner.nextInt();
//        System.out.print("Enter an operator (+, -, *, /): ");
//        String operatorString = scanner.next();
//        char operator = operatorString.charAt(0);
//
//        double result = 0;
//
//        switch (operator) {
//            case '+':
//                result = number1 + number2;
//                break;
//            case '-':
//                result = number1 - number2;
//                break;
//            case '*':
//                result = number1 * number2;
//                break;
//            case '/':
//                if (number2 != 0) {
//                    result = (double) number1 / number2;
//                } else {
//                    System.out.println("Error: Division by zero!");
//                    return;
//                }
//                break;
//            default:
//                System.out.println("Invalid operator!");
//                return;
//        }
//        System.out.print("The result is: " + result );

