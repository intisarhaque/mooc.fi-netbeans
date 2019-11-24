/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
public class StringUtils {
    public static boolean included(String word, String searched)
    {
        String word1 = word.toUpperCase().trim();
        searched=searched.toUpperCase().trim();
        if (word1.contains(searched))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
