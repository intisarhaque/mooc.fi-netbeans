import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        int leng = text.length() ;
        int count = 0;
        String helper = "";
        
        while (count<leng){
            helper = helper + text.substring(leng -1, leng ) ;
            leng -=1;
        }
        if (helper.equals(text)){
            return true;
        }else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
