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
import java.io.File;
import java.io.FileNotFoundException;

public class Printer {
    private File f;
    private Scanner reader;
    
   
    public Printer(String fileName) throws Exception
    {
        this.f = new File(fileName);
        
        
    }
    public void printLinesWhichContain(String word) 
    {
        
        try {
            this.reader = new Scanner(f);
        } catch (Exception ex) {
            System.out.println("file not found");
        }
        
        if (word.length()==0)
        {
            
            while (reader.hasNext()) 
            {
                String nextline = reader.nextLine();
                System.out.println(nextline);
                
            }
        }
        else
        {
            while (reader.hasNext()) 
            {
                String nextline = reader.nextLine();
                if (nextline.contains(word))
                {
                    System.out.println(nextline);
                }
            }
            
        }
        
    }
    
}
