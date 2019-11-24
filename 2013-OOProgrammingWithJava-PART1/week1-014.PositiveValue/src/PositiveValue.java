
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number:");
        int number1 = Integer.parseInt(reader.nextLine());

        int default1 = 0;

        if (number1 > default1) {
            System.out.println("Your number is positive");

        } else if (number1 <= default1) {
            System.out.println("Your number is not positive");
        }

        // Type your program here:
    }
}
