
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String name = reader.nextLine();
        System.out.println("Type the second word: ");
        String name2 = reader.nextLine();
        int index = name.indexOf(name2);
        if (index >= 0){
            System.out.println("The word '" + name2 + "' is found in the word '" + name + "'");
        }
        else {
            System.out.println("The word '" + name2 + "' is not found in the word '" + name + "'");
        }
        
    }
}
