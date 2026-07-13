import java.util.Scanner;

public class Scanner_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        System.out.println(input.nextLine());
        System.out.println("Enter a word: ");
        System.out.println(input.next());
        System.out.println("Enter an Integer: ");
        System.out.println(input.nextInt());
        System.out.println("Enter  Float number: ");
        System.out.println(input.nextFloat());
        System.out.println("Enter a Double number: ");
        System.out.println(input.nextDouble());
        System.out.println("Enter a long number: ");
        System.out.println(input.nextLong());
        System.out.println("Enter true/false: ");
        System.out.println(input.nextBoolean());

        input.close();
    }
}
