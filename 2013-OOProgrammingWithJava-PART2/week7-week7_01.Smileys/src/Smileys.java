
import java.util.*;
public class Smileys {
    

    public static void main(String[] args) {
       /* // Test your method at least with the following
        printWithSmileys("Michael");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");*/
        ArrayList<Book> books = new ArrayList<Book>();
Book objectBook = new Book("Objectbook", 2000);
books.add(objectBook);

if (books.contains(objectBook)) {
    System.out.println("The object book was found.");
}

objectBook = new Book("Objectbook", 2000);

if (!books.contains(objectBook)) {
    System.out.println("The object book was not found.");
}
        
    }
    private static void printWithSmileys(String characterString)
    {
        String middle = printmiddle(characterString);
        int z = middle.length();
        print(z/2);
        System.out.println("");
        System.out.println(middle);
        System.out.print("");
        print(z/2);
        
        
        
        
    }
    
    public static boolean odd(int x)
    {
        if (x%2==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void print(int x)
    {
        
        for (int i=0; i<x; i+=1)
        {
            System.out.print(":)");
        }
    }
    public static String printmiddle(String y)
    {
        /*int x = y.length();
        boolean oddparity = odd(x);
        System.out.print(":) " + y);
        if (oddparity)
        {
            System.out.print("  :)");
        }
        else
        {
            System.out.print(" :)");
        }
        */
        int x = y.length();
        boolean oddparity = odd(x);
        if (oddparity)
        {
            return  ":) " + y + "  :)";
        }
        else 
        {
            return ":) " + y + " :)";
        }
        
        
    }

}

