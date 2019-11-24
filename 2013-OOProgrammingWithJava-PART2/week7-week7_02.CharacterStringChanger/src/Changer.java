/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author intis
 */
import java.util.*;
public class Changer {
    private ArrayList<Change> letters;
    
    public Changer()
    {
        this.letters = new ArrayList<Change>();
    }
    public void addChange(Change change)
    {
        
        letters.add(change);
    }
    public String change(String characterString) 
    {
        String sendback = "";
        char z;
        for (int i=0;i<characterString.length();i+=1)
        {
            z = characterString.charAt(i);
            for(Change temp:letters)
            {
               
                if (z==temp.getfrom())
                {
                    
                    z=temp.getto();
                }
            }
            sendback = sendback+z;
        }
        
        return sendback;
    }
}
