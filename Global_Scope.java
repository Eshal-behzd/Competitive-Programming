public class Global_Scope{

    // Global Scope: Accessible throughout the class
    static String university = "AWKUM";

    public static void main(String[] args) {
        System.out.println("University " + university );
        ShowUniversity();
        
    }
    static void ShowUniversity(){
        System.out.println("Accessing in function: " + university);
    }
}