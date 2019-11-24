/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.*;

/**
 *
 * @author Intisar
 */
public class Box implements Thing{
    private int maxcapacity;    
    private ArrayList<Thing> items;
    public Box(int maximumCapacity)
    {
        items =  new ArrayList<Thing>();
        this.maxcapacity=maximumCapacity;
    }
    public boolean addThing(Thing thing)
    {
        
        if (this.getVolume()+thing.getVolume()<=this.maxcapacity)
        {
           items.add(thing);
           return true;
        }
        else        
        {
            return false;
        }
        
        
    }
    

    @Override
    public int getVolume() 
    {
        int currentVolume =0;
        for (Thing i:items)
        {
            currentVolume +=i.getVolume();
        }     
        return currentVolume;
        
    }
    
}
