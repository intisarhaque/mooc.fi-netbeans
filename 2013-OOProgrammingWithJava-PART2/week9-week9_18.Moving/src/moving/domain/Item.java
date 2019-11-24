/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Intisar
 */
public class Item implements Thing, Comparable<Item>{
    private String name;
    private int volume;
    
    @Override
    public int getVolume() {
        return this.volume;
    }
    public String getName()
    {
        return this.name;
    }
    
    public Item(String name, int volume)
    {
        this.name=name;
        this.volume=volume;
    }
    public String toString()
    {
        return this.name +" (" + this.volume + " dm^3)";
    }

    
    public int compareTo(Item o) 
    {
        if (o.getVolume()<this.getVolume())
        {
            return 1;
        }
        else if (o.getVolume()>this.getVolume())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
