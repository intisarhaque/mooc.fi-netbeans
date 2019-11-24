
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       
        System.out.println("Enter first number:");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Enter second number to divide:");
        int number2 = Integer.parseInt(reader.nextLine());
        
        double number3 = (double)number1 / number2;
        
        String toprint = number1 + "/" + number2 + "=" + number3; 
        
        
        System.out.println("Division:" + toprint);
        // Implement your program here. Remember to ask the input from user.
    }
}
