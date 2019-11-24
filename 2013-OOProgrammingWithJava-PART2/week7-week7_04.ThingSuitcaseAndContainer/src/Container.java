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
public class Container {
    private ArrayList<Suitcase> Suitcases = new ArrayList<Suitcase>();
    private int max;
    
    public Container(int max)
    {
        this.max=max;
    }
    public void addSuitcase(Suitcase suitcase)
    {
        if (totalWeight()+suitcase.totalWeight()<=max)
        {
            Suitcases.add(suitcase);
        }
        
    }
    public String toString()
    {
        return (Suitcases.size()+ " suitcases (" + totalWeight()+" kg)");
    }
    public int totalWeight()
    {
        int weight =0;
        for (Suitcase o:Suitcases)
        {
            weight = weight+o.totalWeight();
        }
        return weight;
    }
    public void printThings()
    {
        //System.out.println("There are the following things in the container suitcases:");
        for (Suitcase o:Suitcases)
        {
            o.printThings();
        }
    }
    
}
