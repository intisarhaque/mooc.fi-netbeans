
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        int numb = Integer.parseInt(reader.nextLine());
        int count = 0;
        int sum = 0;
        while (count <= numb){
            int result = (int)Math.pow(2,count);
            sum += result;
            count += 1;
        }
        System.out.println(10 % 2);
        
        
        
        
    }
}
