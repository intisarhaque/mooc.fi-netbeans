/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.*;
import java.io.*;
/**
 *
 * @author Intisar
 */
public class MindfulDictionary {
    private HashMap<String, String> translations;
    private File file;
    public MindfulDictionary()
    {
        this.translations = new HashMap<String, String>();        
    }
    public MindfulDictionary(String file)
    {
        this.file = new File(file);
        this.translations = new HashMap<String, String>();     
    }
    public boolean load()
    {
        try
        {
            Scanner x = new Scanner(file);
            while (x.hasNextLine())
            {
                String line = x.nextLine();
                String[] words = line.split(":");
                translations.put(words[0], words[1]);                    
            }
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public boolean save() {
        try
        {
            String y = file.getName();
            ArrayList<String> newfile = new ArrayList<String>();
            for (String x: translations.keySet())
            {
                newfile.add(x+":"+translations.get(x));                        
            }
            FileWriter x = new FileWriter(file);
            for (String z:newfile)
            {
                x.write(z + "\n");
            }
            x.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    
    public void add(String word, String translation)
    {
        if (!translations.containsKey(word))
        {
            translations.put(word, translation);
        }
    }
    public String translate(String word)
    {
        if (translations.containsKey(word))
        {
            return translations.get(word);
        }
        else if (translations.containsValue(word))
        {
            
            for (String x: translations.keySet())
            {
                if (translations.get(x).equals(word))
                {
                    return x;
                }
                
            }
        }
       
        return null;
    }
    public void remove(String word)
    {
        if (translations.containsKey(word))
        {
            translations.remove(word);
        }
        else if (translations.containsValue(word))
        {
            String y="";
            HashMap<String, String> temp = translations;
            for (String x: temp.keySet())
            {
                if (temp.get(x).equals(word))
                {
                    y=x;
                }
                
            }
            translations.remove(y);
        }
       
    }
    
    
    
}
