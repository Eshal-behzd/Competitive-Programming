import java.util.Scanner;
public class Switch_Statement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fruit : ");
        String Fruit = input.next();
        switch (Fruit){
            case "mango":
                System.out.print("King of fruits");
                break;
            case "apple":
                System.out.print("Keeps the Doctor away. ");
                break;
            case "grapes" :
                System.out.print("Supports Heart Health. ");
                break;
            case "banana":
                System.out.print("Gives quick energy");  
                break;
            default :
                System.out.print("Please Enter a valid Fruit");             
        }

    }

    
}
