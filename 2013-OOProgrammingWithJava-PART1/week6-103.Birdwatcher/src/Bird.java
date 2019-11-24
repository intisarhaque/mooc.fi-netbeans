/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
public class Bird {
    String name;
    String latin;
    int times;
    
    public Bird(String name, String latin)
    {
        this.name=name;
        this.latin=latin;
        this.times=0;
    }
    public String getName()
    {
        return this.name;
    }
    public String getLatin()
    {
        return this.latin;
    }
    public int getTimes()
    {
        return this.times;
    }
    public void timesPlus()
    {
        this.times+=1;
    }
    
}
