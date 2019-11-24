
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name:");
        String name1 = reader.nextLine();
        System.out.println("Type your age:");
        int number1 = Integer.parseInt(reader.nextLine());
        
        
        System.out.println("Type your name:");
        String name2 = reader.nextLine();
        System.out.println("Type your ager:");
        int number2 = Integer.parseInt(reader.nextLine());
        
        int number3 = number1 + number2;
                
        System.out.println(name1 +" and "+ name2 + " are " + number3 + " years in total.");
        // Implement your program here
    }
}
