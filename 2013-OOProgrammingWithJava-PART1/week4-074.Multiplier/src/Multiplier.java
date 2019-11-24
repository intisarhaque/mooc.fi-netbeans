/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */

public class Multiplier
{
    private int times;
    
    public Multiplier(int number)
    {
       this.times=number; 
    }
    public int multiply(int otherNumber)
    {
        return this.times*otherNumber;
    }
}

