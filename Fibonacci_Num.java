import java.util.Scanner;
public class Fibonacci_Num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count < n){
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + b);
    }
}