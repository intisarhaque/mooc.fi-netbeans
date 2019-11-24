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
public class PromissoryNote {
    private HashMap<String, Double> notes;// = new HashMap<String, Integer>();
    
    public PromissoryNote()
    {
        notes = new HashMap<String, Double>();
           
    }
    public void setLoan(String toWhom, double value)
    {
        this.notes.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose)
    {
        /*if (notes.get(whose)==null)
        {
            return 0;
        }*/
        if (notes.containsKey(whose))
        {
            return notes.get(whose);
        }
        else
        {
            return 0;
        }
        
    }
}
