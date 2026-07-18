import java.util.Scanner;

public class While_loop_Num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of iterations: ");

        // print numbers from 1 to num using a while loop
        int num = input.nextInt();
        int i = 1;
        while(i <= num){
            System.out.println(i);
            i++;
        }

        // print odd numbers from 1 to num using a while loop
        System.out.print("\nEnter number of odd iterations: ");
        int odd = input.nextInt();
        int j = 1;
        while (j <= odd){
            System.out.println(j);
            j += 2;

        }

        // print even numbers from 1 to num using a while loop
        System.out.print("Enter number of even iterations: ");
        int even = input.nextInt();
        int k = 1;
        while (k <= even){
            if (k % 2 == 0){
                System.out.println(k);
            }
            k++;
        }

    }
    
}
