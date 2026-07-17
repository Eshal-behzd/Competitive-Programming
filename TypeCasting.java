import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        float value = num; // Implicit type casting from int to float
        System.out.print(num);
        System.out.print(" is converted to ");
        System.out.println(value);


        int num1 = (int) value; // Explicit type casting from float to int
        System.out.print(value + " is converted to ");
        System.out.println(num1);


        int num2 = 258;         
        byte value1 = (byte) num2; // Explicit type casting from int to byte
        System.out.print(num2 + " is converted to ");
        System.out.println(value1);

        byte s = 12;
        byte t = 10;
        int sum = s + t; // Implicit type casting from byte to int
        System.out.println(sum + " is the sum of " + s + " and " + t);

        int letter = 'A';
        char ch = (char) letter; // Explicit type casting from int to char
        System.out.println(ch + " is the character representation of " + letter);

        int let ='a';
        char ch1 = (char) let; // Explicit type casting from int to char
        System.out.println(ch1 + " is the character representation of " + let);


        byte b = 10;
        char c = 'a';
        float f = 2.34f;
        short h = 5;
        int i = 100;
        double d = 20.5;
        double result = (f * b) + (i / c) - (d * h); // Implicit type casting from byte, char, short, int to double
        System.out.println("Components: " + (f * b) + " " + (i / c) + " " + (d * h));
        // float * byte = float, int / char = int, double * short = double
        System.out.println(result);
    }
}
