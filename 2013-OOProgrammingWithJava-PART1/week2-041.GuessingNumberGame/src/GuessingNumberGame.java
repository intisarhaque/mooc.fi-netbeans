
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess;
        guess = 0;
        int count = 0;
        System.out.println(numberDrawn);
        while (guess != numberDrawn){
            System.out.println("Guess a number:");
            guess = Integer.parseInt(reader.nextLine());
            if (guess<numberDrawn){
                System.out.print("The number is greater");
            }else if (guess>numberDrawn){
                System.out.print("The number is lesser");
            }else{
                System.out.print("Congratulations, your guess is correct!");
            }
            count +=1;
            System.out.println(", guesses made: " + count);
        }
        
                
        

        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
