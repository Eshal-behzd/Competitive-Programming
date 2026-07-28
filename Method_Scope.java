import java.lang.reflect.Method;

public class Method_Scope {

    // Method Scope: Variables declared inside a method can only be accessed within that method.

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        // System.out.println(num1 + num2 );        // Error: num1 and num2 belong to another method
        System.out.println(a + b);
    }   
    static void random() {
        int num1 = 10;                   // Method scope: accessible only inside the random() method
        int num2 = 30;
        System.out.println(num1 + num2 );
        // System.out.println(a + b);              Error: a and b belong to another method

    } 
}