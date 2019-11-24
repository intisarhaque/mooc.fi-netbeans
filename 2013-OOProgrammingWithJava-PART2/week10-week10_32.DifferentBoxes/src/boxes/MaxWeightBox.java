/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Intisar
 */
import java.util.*;
public class MaxWeightBox extends Box {
    private int capacity;
    
    private ArrayList<Thing> things;
    public MaxWeightBox(int capacity)
    {
        this.capacity=capacity;
        things = new ArrayList<Thing>();
    }
    

    @Override
    public void add(Thing thing) {
        int volume = 0;
        for (Thing t:things)
        {
            volume+=t.getWeight();
        }
        if (thing.getWeight()+volume<=capacity)
        {
            volume+=thing.getWeight();
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (things.contains(thing))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
