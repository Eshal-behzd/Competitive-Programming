public class String_Arg {
    public static void main(String[] args){
        String greeting = greet("Eshal Behzad");
        System.out.print(greeting);

    }
    static String greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
