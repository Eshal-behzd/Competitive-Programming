public class Passing_value {

    public static void main(String[] args) {
        
        // Java supports only pass-by-value, not pass-by-reference.

        int num1 = 10;
        num(num1);
        System.out.println(num1);
    }
   static void num(int x){
    x = 100;
   }
    
}


