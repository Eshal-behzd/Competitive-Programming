import java.util.Scanner;
public class Nested_Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int EmpId = input.nextInt();
        System.out.print("Enter Department: ");
        String Department = input.next();
        switch (EmpId) {
            case 1:
                System.out.println("Employee ID : 1");
                switch (Department) {
                case "IT":
                    System.out.println("Department : IT");
                    break;
                case "Management":
                    System.out.println("Department: Management");
                    break;
                case "Software":
                    System.out.println("Department: Software");        
                    break;
                default:
                    System.out.println("Invalid Department");
                    
            }
            break;
            case 2:
                System.out.println("Employee ID : 2 ");
                break;
            case 3: 
                System.out.println("Employee ID : 3");  
                break;  
            
            
        default:
            System.out.println("Invalid Employee ID");
        }

    }
}
