import java.util.Scanner;
public class Case_checking {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().trim().charAt(0);
        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("The character is an uppercase letter.");
        }
        else {
            System.out.println("The character is a lowercase letter.");
        }
        

    }
    
}
