import java.util.Scanner;
public class For_Loop_Numbers {
    public static void main(String[] args ){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number of iterations: ");
        int num = input.nextInt();
        // print numbers from 1 to num using a for loop
        for (int i = 1; i <= num ; i++){
            System.out.print(i + " " );
        }
        System.out.print("\nEnter Number of odd iterations: ");
        int odd = input.nextInt();


        // print odd numbers from 1 to num using a for loop
        for (int i = 1; i <= odd; i++){
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // print even numbers from 1 to num using a for loop
        System.out.print("\nEnter Number of even iterations: ");
        int even =input.nextInt();
        for (int i = 1; i <= even ;i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

}
