import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        String operatorString = scanner.next();
        char operator = operatorString.charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = (double) number1 / number2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.print("The result is: " + result );
    }
}