
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius:");
        int rad = Integer.parseInt(reader.nextLine());
        
        double circum = (double)rad * 2 * Math.PI;
        System.out.println("Circumference of the circle:" + circum);
        
       
    }
}
