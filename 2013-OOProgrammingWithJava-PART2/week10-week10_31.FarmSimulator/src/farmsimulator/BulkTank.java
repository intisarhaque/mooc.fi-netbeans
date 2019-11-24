/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Intisar
 */
public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank()
    {
        this.capacity=2000;
        this.volume=0;
    }
    public BulkTank(double capacity)
    {
        this.capacity=capacity;
        this.volume=0;
    }
    public double getCapacity()
    {
        return this.capacity;
    }
    public double getVolume()
    {   
        return this.volume;
    }
    public double howMuchFreeSpace()
    {
        return this.capacity-this.volume;
    }
    public void addToTank(double amount)
    {
        if (this.howMuchFreeSpace()<amount)
        {
            this.volume=this.capacity;
        }
        else
        {
            this.volume+=amount;
        }
    }
    public double getFromTank(double amount)
    {
        if (this.volume>amount)
        {
            this.volume-=amount;
            return amount;
        }
        else
        {
            double y = this.volume;
            this.volume=0;
            return y;            
        }
    }
    public String toString()
    {
        double x = Math.ceil(volume);
        double y = Math.ceil(capacity);
        return x + "/" + y;
    }

}
