
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int length = name.length();
        int count = 0;
        while (count<length){
            System.out.println(count+1 + ". character: " + name.charAt(count));
            count +=1;
        }
        
    }
}
