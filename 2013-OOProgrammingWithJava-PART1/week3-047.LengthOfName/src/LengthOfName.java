
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        calculateCharacters(name);
        
        
    }
    
    
    public static int calculateCharacters(String name){
        int charcount = name.length();
        System.out.println("number of characters:" + charcount);
        return(charcount);
        
        
        
        
        
        
        
    }
    // do here the method
    // public static int calculateCharacters(String text)
    
}
