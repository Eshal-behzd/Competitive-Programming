import java.util.Scanner;
public class Conditionals{
    public static void main(String[] args){
        Scanner salary = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int salary1 = salary.nextInt();
        if (salary1 > 10000) {
            System.out.println("Your salary with bonus is: " + (salary1 + 2000));
        }    
        else {
            System.out.println("Your salary with bonus is: " + (salary1 + 1000));
        }
    }
 }

