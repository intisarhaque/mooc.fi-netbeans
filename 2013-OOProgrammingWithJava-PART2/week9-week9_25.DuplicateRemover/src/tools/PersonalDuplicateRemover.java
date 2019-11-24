/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.*;

/**
 *
 * @author Intisar
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private List<String> words = new ArrayList<String>();
    private int duplicates = 0;

    @Override
    public void add(String characterString) {
        
        if (words.contains(characterString))
        {
            this.duplicates +=1;
        }
        words.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;       
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> unique = new HashSet<String>();
        for (String s:words)
        {
            if (!unique.contains(s))
            {
                unique.add(s);
            }                    
        }
        return unique;
        
    }

    @Override
    public void empty() {
        int size = words.size();
        for (int i=0;i<size;i+=1)
        {
            words.removeAll(words);
        }
        this.duplicates=0;
    }
    
}
