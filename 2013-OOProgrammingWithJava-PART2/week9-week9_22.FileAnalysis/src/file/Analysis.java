/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;
import java.util.*;


/**
 *
 * @author Intisar
 */
public class Analysis {
    private File f;
    private Scanner reader;
    private List<String> lines;
    private List<Character> letters;
    private String characters;
    public Analysis(File file) throws Exception
    {
        this.f = file;
    }
    
    public int characters()
    {
        this.characters="";
        this.letters = new ArrayList<Character>();
        try {
            this.reader = new Scanner(f);
        } catch (Exception ex) {
            System.out.println("file not found");
        }
        while (reader.hasNext())
        {
            this.characters += " " + reader.next();
        }
        return this.characters.length();
        
        
    }
    public int lines()
    {
        this.lines = new ArrayList<String>();
        try {
            this.reader = new Scanner(f);
        } catch (Exception ex) {
            System.out.println("file not found");
        }
        while (reader.hasNextLine())
        {
            lines.add(reader.nextLine());
        }
        return lines.size();
        
    }
}
