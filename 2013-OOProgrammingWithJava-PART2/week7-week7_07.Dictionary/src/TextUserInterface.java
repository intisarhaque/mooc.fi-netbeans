/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
import java.util.*;
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary)
    {
        this.reader=reader;
        this.dictionary=dictionary;
        
    }
    public void start()
    {
        printstatement();
        options();
        
    }
    public void printstatement()
    {
        System.out.println("Statement: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quite the text user interface");
        
    }
    public void options()
    {
        while (true)
        {
            System.out.print("Statement: ");
            String x = reader.nextLine();
            if (x.equals("quit"))
            {
                System.out.println("Cheers!");
                break;
            }
            else if (x.equals("add"))
            {
                System.out.print("In Finninsh: ");
                String y = reader.nextLine();
                System.out.print("Translation: ");
                String z = reader.nextLine();
                dictionary.add(y,z);
            }
            else if (x.equals("translate"))
            {
                System.out.print("Give a word: ");
                String y = reader.nextLine();
                System.out.println(dictionary.translate(y));
            }
        }
    }
    
}
