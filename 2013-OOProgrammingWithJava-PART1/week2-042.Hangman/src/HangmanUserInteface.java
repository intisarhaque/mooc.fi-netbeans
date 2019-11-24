
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");
        int count = 0;
        String broken;
        broken = ("hmm");
        while (!broken.equals("quit")){
            count +=1;
            System.out.println("Type a command:");
            String option = reader.nextLine();
            if (option.equals("status")){
            hangman.printStatus();
            }
            if (option.length() == 1){
                hangman.guess(option);
            }
            if (option.isEmpty()){
                printMenu();
            }
            if (option.equals("quit")){
                System.out.println("Thank you for playing!");
                broken = option;
                break;
                
            }
            hangman.printMan();
            hangman.printWord();
        }
        
        

        // PROGRAM YOUR SOLUTION HERE


        
                
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
