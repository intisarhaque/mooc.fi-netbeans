/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;
import java.util.Random;

/**
 *
 * @author Intisar
 */
public class Cow implements Alive,Milkable{
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private double capacity;
    private double volume;
    private String name;
    
    public Cow() 
    {
        this.capacity = 15 + new Random().nextInt(26);
        int x = new Random().nextInt(30);
        this.name=this.NAMES[x];
    }
    public Cow(String name) 
    {
        this.capacity = 15 + new Random().nextInt(26);
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public double getCapacity() 
    {
        return this.capacity;
    }
    public double getAmount() 
    {
        return this.volume;
    }
    
    
    public String toString() 
    {
        double x = Math.ceil(volume);
        double y = Math.ceil(capacity);
        return this.name + " " + x + "/" + y;
    }
    public void liveHour()
    {
        int x = new Random().nextInt(13)+7;
        double z = (double)x/10;
        if (z+volume>capacity)
        {
            volume=capacity;
        }
        else
        {
            this.volume+=z;
        }
    }
    public double milk()
    {
        double y = this.volume;
        this.volume=0;
        return y;
    }
            
    
}
