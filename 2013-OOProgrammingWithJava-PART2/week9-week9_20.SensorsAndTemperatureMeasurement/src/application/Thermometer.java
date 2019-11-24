/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;
/**
 *
 * @author Intisar
 */
public class Thermometer implements Sensor {
    
    
    private String status;
    

    public Thermometer()
    {
        this.status="off";
    }
    
    @Override
    public boolean isOn() {
        if (this.status.equals("on"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void on() {
        this.status="on";
    }

    @Override
    public void off() {
        this.status="off";
    }

    @Override
    public int measure() 
    {        
        Random x = new Random();
        if (this.status.equals("on"))
        {
            int z = x.nextInt(60)-30;
            return z;
        }
        else
        {
            throw new IllegalArgumentException("Error");
        }
    }
    
}
