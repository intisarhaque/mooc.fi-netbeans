
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Enter second number to add:");
        int number2 = Integer.parseInt(reader.nextLine());
        
        int number3 = number1 + number2;
        
        
        System.out.println("Sum of the numbers:" + number3);
        
        // Implement your program here. Remember to ask the input from user
    }
}
