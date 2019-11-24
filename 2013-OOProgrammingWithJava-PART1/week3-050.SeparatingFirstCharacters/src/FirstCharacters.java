import java.util.Scanner;

public class FirstCharacters {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int len = name.length();
        if (len>3){
            firstCharacters(name);
        }
               
        
    }
    
    public static void firstCharacters(String name){
        char name1 = name.charAt(0);
        char name2 = name.charAt(1);
        char name3 = name.charAt(2);
        eachletter(name1, name2, name3);
        
        
       }
    public static char eachletter(char name1, char name2, char name3){
        System.out.println("1. character: " + name1);
        System.out.println("2. character: " + name2);
        System.out.println("3. character: " + name3);
        return name1;
       } 
}
