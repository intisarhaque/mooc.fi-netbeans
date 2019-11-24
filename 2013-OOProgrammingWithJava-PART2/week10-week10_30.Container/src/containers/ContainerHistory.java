/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Intisar
 */
import java.util.*;
public class ContainerHistory {
    private ArrayList<Double> history;
    public ContainerHistory() 
    {
        this.history = new ArrayList<Double>();
    }
    public void add(double situation) 
    {
        this.history.add(situation);
    }
    public void reset() 
    {
        this.history = new ArrayList<Double>();
    }
    public String toString() 
    {
        return this.history.toString();
    }
    public double maxValue() 
    {
        double max = 0;
        for (double x: this.history)
        {
            if (x>max)
            {
                max = x;
            }
        }
        return max;
    }
    public double minValue()
    {
        double min = Integer.MAX_VALUE;
        for (double x: this.history)
        {
            if (x<min)
            {
                min = x;
            }
        }
        return min;
    }
    public double average()
    {
        double total = 0;
        for (double x: this.history)
        {
            total +=x;
        }
        return total/this.history.size();
    }
    public double greatestFluctuation() 
    {
        double greatest;
        if (this.history.size()<=1)
        {
            return 0;
        }
        else
        {
            greatest=0;
            double previous=history.get(0);
            for (double x: this.history)
            {
                double z = Math.abs(x-previous);
                if(z>greatest)
                {
                    greatest=z;
                }
                previous=x;
            }
        }
        return greatest;
        
    }
    public double variance() 
    {
        if (this.history.size()<=1)
        {
            return 0;
        }
        else
        {
            double aveg = this.average();
            double var = 0;
            
            for (double numb : history){
                double meg = (numb-aveg)*(numb-aveg);
                var += meg;
            }
            System.out.println(var);
            double beg = history.size()-1;
            var = var/beg;
            return var;
        }
    }
    
}
