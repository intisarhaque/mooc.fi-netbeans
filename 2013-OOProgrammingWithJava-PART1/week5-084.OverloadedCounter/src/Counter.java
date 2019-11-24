/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
public class Counter {
    private int value;
    private boolean checking;
    
    public Counter(int startingValue, boolean check)
    {
        this.value=startingValue;
        this.checking=check;
    }
    public Counter(int startingValue)
    {
        this.value=startingValue;
        this.checking=false;
    }
    public Counter(boolean check) 
    {
        this.value=0;
        this.checking=check;
    }
    public Counter()
    {
        this.value=0;
        this.checking=false;
    }
    public int value()
    {
        return this.value;
    }
    public void increase()
    {
        this.increase(1);
    }
    public void decrease()
    {
        if(this.checking==true)
        {
            if (this.value!=0)
             {
                 this.decrease(1);               
             } 
        }
        else if (this.checking==false)
        {
            this.value-=1;
        }
    }
    public void increase(int increaseAmount)
    {
        if (increaseAmount>0)
        {
            this.value+=increaseAmount;
        }
        
    }
    public void decrease(int decreaseAmount)
    {
        int x = this.value-decreaseAmount;
        if (decreaseAmount>0)
        {
           if(this.checking==true)
            {
                if (x>=0)
                {
                    if (this.value!=0)
                    {
                        this.value-=decreaseAmount;               
                    } 
                }
                else if (x<0)
                {
                    this.value=0;
                }
                
            }
           else if (this.checking==false)
            {
                this.value-=decreaseAmount;
            } 
        }
        
    }
    public String toString()
    {
        return this.value + " " + this.checking;
    }
}

