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
public class Box implements ToBeStored {
    private double maxweight;        
    private List<ToBeStored> thinglist = new LinkedList<ToBeStored>();
    public Box(double weight)
    {
        this.maxweight=weight;
    }
    public void add(ToBeStored x)
    {
        if (weight()+x.weight() < maxweight)
        {
            thinglist.add(x);
            weight();            
        }
    }
    public double weight()
    {
        double weightt=0;
        for (ToBeStored x: thinglist)
        {
            weightt += x.weight();
        }
        return weightt;
    }
    public String toString()
    {
        return "Box: " + thinglist.size() + " things, total weight " + weight() + " kg";
    }
}
