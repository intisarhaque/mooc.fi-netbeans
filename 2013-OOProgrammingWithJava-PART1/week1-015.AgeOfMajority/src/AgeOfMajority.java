
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("How old are you?");
        int number1 = Integer.parseInt(reader.nextLine());

        int default1 = 18;

        if (number1 >= default1) {
            System.out.println("You have reached the age of majoirty!");

        } else if (number1 < default1) {
            System.out.println("You have not reached the age of majority yet!");
        }

        // Type your program here 
    }
}
