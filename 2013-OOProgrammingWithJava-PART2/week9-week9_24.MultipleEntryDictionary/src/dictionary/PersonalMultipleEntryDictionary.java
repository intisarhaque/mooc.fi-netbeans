/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.*;

/**
 *
 * @author Intisar
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> translations = new HashMap<String, Set<String>>();

    @Override
    public void add(String word, String entry) {
        if (translations.containsKey(word))
        {
            
            translations.get(word).add(entry);
            
        }
        else
        {            
            Set<String> ww = new HashSet<String>();
            translations.put(word, ww);
            translations.get(word).add(entry);
        }
    }

    @Override
    public Set<String> translate(String word) {
        Set<String> translationss = new HashSet<String>();
        if (translations.containsKey(word))
        {
            for (String s: translations.get(word))
            {
                translationss.add(s);
            }
            return translationss;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void remove(String word) {
        if (translations.containsKey(word))
        {
            translations.remove(word);
        }       
        
    }
    
    
}
