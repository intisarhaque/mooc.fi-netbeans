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
public class Dictionary {
    private HashMap<String, String> translations = new HashMap<String, String>();
    //key/value
    public void add(String word, String translation)
    {
        translations.put(word, translation);
    }
    public String translate(String word)
    {
        if (translations.containsKey(word))
        {
            return translations.get(word);
        }
        else
        {
            return null;
        }
    }
    public int amountOfWords()
    {
        return translations.size();
    }
    public ArrayList<String> translationList()
    {
        ArrayList<String> list = new ArrayList<String>();
        for ( String key : translations.keySet() ) 
        {
            String x = ( key + " = " + translations.get(key) );
            list.add(x);
        }
        return list;
    }
    
    
}
