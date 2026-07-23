import java.util.Scanner;
public class NestedSwitch_Enhanced {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int EmpId = input.nextInt();
        System.out.print("Enter Department: ");
        String Department = input.next();
        switch (EmpId) {
            case 1 ->{
               System.out.println("Employee ID : 1");
               switch (Department){
                  case "IT" -> System.out.println("Department : IT");
                  case "Management" -> System.out.println("Department : Management");
                  case "Software" -> System.out.println("Department: Software");
                  default -> System.out.println("Invalid Department");
               }
            }   
            case 2 -> System.out.println("Employee ID : 2");
            case 3 -> System.out.println("Employee ID : 3");
            default -> System.out.println("Invalid Employee ID");    
        }
    }
}        
