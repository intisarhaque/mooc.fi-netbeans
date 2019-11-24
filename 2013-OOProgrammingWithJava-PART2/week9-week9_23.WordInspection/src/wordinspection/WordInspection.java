/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Intisar
 */
public class WordInspection {
    private File f;
    private Scanner reader;
    public WordInspection(File file) throws Exception
    {
        this.f=file;
    }
    public int wordCount()
    {
        try
        {
            this.reader = new Scanner(f);
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        List<String> list = new ArrayList<String>();
        while (reader.hasNextLine())
        {
            list.add(reader.nextLine());
        }
        return list.size();
    }
    public List<String> wordsContainingZ()
    {
        try
        {
            this.reader = new Scanner(f);
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        List<String> list = new ArrayList<String>();
        while (reader.hasNextLine())
        {
            String x = reader.nextLine();
            if (x.contains("z"))
            {
                list.add(x);
            }
           
        }
        return list;
    }
     public List<String> wordsEndingInL()
     {
        try
        {
            this.reader = new Scanner(f);
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        List<String> list = new ArrayList<String>();
        while (reader.hasNextLine())
        {
            String x = reader.nextLine();
            int z = x.length();
            String blegh = "";
            blegh += x.charAt(z-1);
            if (blegh.equals("l"))
            {
                list.add(x);
            }
        }
        return list;
     }
     public List<String> palindromes()
     {
        try
        {
            this.reader = new Scanner(f);
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        List<String> list = new ArrayList<String>();
        while (reader.hasNextLine())
        {
            String x = reader.nextLine();
            int z = x.length();
            String reverse = "";
            for (int i = z-1;i>=0;i-=1)
            {
                reverse += x.charAt(i);
            }
            if (x.equals(reverse))
            {
               list.add(x);
            }
        }
        return list;
     }
     public List<String> wordsWhichContainAllVowels()
     {
        try
        {
            this.reader = new Scanner(f);
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        List<String> list = new ArrayList<String>();
        while (reader.hasNextLine())
        {
            String x = reader.nextLine();
            if (x.contains("a")&&x.contains("e")&&x.contains("i")&&x.contains("o")&&x.contains("u")&&x.contains("y")&&x.contains("ä")&&x.contains("ö"))
            {
                list.add(x);
            }
        }
        return list;
     }
}
