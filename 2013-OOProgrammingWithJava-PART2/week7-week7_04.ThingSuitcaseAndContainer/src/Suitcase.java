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
public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int max;
    
    public Suitcase(int maxweight)
    {
        this.max=maxweight;
    }
    public void addThing(Thing thing)
    {
        if (thing.getWeight()+totalWeight()<=max)
        {
            things.add(thing);
        }
        
    }
    public String toString()
    {
        int x = things.size();
        int weight = 0;
        for (Thing o:things)
        {
            weight += o.getWeight();
        }
        if (x==0)
        {
            return ("empty (0kg)");
        }
        if (x==1)
        {
            return (x + " thing (" + weight + "kg)");
        }
        else
        {
            return (x + " things (" + weight + "kg)");
        }
        
    }
    public void printThings()
    {
        for (Thing o:things)
        {
            System.out.println(o.getName()+ " (" + o.getWeight() + " kg)");
        }
    }
    public int totalWeight()
    {
        int weight=0;
        for (Thing o:things)
        {
            weight += o.getWeight();
        }
        return weight;
    }
    public Thing heaviestThing()
    {
        if (things.size()>0)
        {
            int weight=0;
            Thing heaviest = new Thing("", weight);
            for (Thing o:things)
            {
                if (o.getWeight()>weight)
                {
                    weight=o.getWeight();
                    heaviest=o;
                }
            }
            return heaviest; 
        }
        return null;
        
    }
    
}
