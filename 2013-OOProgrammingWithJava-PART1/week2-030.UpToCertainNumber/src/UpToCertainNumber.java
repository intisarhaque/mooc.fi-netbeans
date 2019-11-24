
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int sumb = 0;
        System.out.println("Up to what number?");
        int numb = Integer.parseInt(reader.nextLine());
        int count = 0;
        while (count < numb){
            sumb +=1;
            count +=1;
            System.out.println(sumb);
        }
        // Write your code here
        
    }
}
