import java.util.Scanner;
public class Enhanced_Switch_Statement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fruit : ");
        String Fruit = input.next();
        switch (Fruit) {
            case "mango" -> System.out.print("King of fruits");
            case "apple" -> System.out.print("Keeps the Doctor away. ");
            case "grapes" -> System.out.print("Supports Heart Health. ");
            case "banana" -> System.out.print("Gives quick energy");
            case "orange" -> System.out.print("Boost immunity");
            default -> System.out.print("Please Enter a valid Fruit");
        }
    }
}
