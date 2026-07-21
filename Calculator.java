import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
    System.out.println("Welcome to the Calculator!");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();
    System.out.print("Enter the operation (+, -, *, /): ");
    char operation = scanner.next().charAt(0);
    double result = 0;
    boolean validOperation = true;

    switch (operation) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
            break;
        default:
            System.out.println("Error: Invalid operation.");
            validOperation = false;
    }

    if (validOperation) {
        System.out.println("Result: " + result);
    }

    scanner.close();
}
}