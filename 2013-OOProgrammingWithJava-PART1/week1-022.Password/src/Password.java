
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        while (true){
            System.out.println("Type the password:");
            String pass = reader.nextLine();
            if (pass != password){
                System.out.println("Wrong!");
                        
            }
            if (pass.equals(password)){
                break;
            }
        }
        
        System.out.println("Right!");
        System.out.println("");
        System.out.println("The secret is jryy qbar!");
       
            
            
            
        
        
        
        // Write your code here
    }
}
