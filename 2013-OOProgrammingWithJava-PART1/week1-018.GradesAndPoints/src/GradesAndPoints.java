
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]:");
        int points = Integer.parseInt(reader.nextLine());
        if (0 <= points && points <=29) {
            System.out.println("Fail");         
            
        }
        if (30 <= points){
            if (points <=34){
                System.out.println("Grade:1");
            }
        }
        if (35 <= points){
            if (points <=39){
                System.out.println("Grade:2");
            }
        }
        if (40 <= points){
            if (points <=44){
                System.out.println("Grade:3");
            }
        }
        if (45 <= points){
            if (points <=49){
                System.out.println("Grade:4");
            }
        }
        if (50 <= points){
            if (points <=60){
                System.out.println("Grade:5");
            }
        }
        
    }
}
