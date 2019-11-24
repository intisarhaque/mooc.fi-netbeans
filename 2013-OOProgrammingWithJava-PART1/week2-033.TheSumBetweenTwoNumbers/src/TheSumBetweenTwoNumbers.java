
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First:");
        int count = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last:");
        int numb = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        while (count <= numb){
            
            sum += count;
            count +=1;
            
        }
        System.out.println(sum);
        
    }
}
