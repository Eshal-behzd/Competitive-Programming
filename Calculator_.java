import java.util.Scanner;
public class Calculator_ {
    public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the operation '+' '-' '*' '/' '%': ");
        char op = input.next().trim().charAt(0);
        if (op == '+'){
            System.out.print("Sum: " + (num1 + num2));
        }
        if (op == '-'){
            System.out.print("Difference: " + (num1 - num2));
        }
        if (op == '*'){
            System.out.print("Product: " + (num1 * num2));
        }
        if (op == '/'){
            System.out.print("Quotient: " + (num1 / num2));
        }
        if (op == '%'){
            System.out.print("Remainder: " + (num1 % num2));
        }
        
        

    }
}        