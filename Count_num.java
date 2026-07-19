import java.util.Scanner;
public class Count_num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =input.nextInt();
        int count = 0;
        System.out.print("Enter the digit to count: ");
        int x = input.nextInt();
        while(num > 0){
            int rem = num % 10;
            if(rem == x){
                count++;
            }
            num /= 10;
        }
        System.out.println("The number of " + x + " in the given number is: " + count);
    }
}
