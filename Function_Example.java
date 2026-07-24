import java.util.Scanner;
public class Function_Example {
    public static void main(String[] args) {
        int ans =sum();
        System.out.print("The sum is " + ans );
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return(sum ); 

    }
    
}
