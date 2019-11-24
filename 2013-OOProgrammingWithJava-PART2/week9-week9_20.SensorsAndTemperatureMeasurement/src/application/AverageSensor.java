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
public class AverageSensor implements Sensor{
    private List<Sensor> list =  new ArrayList<Sensor>();
    private List<Integer> readings =  new ArrayList<Integer>();
    
    public void addSensor(Sensor additional)
    {
        list.add(additional);
    }
    
    @Override
    public boolean isOn() 
    {
        boolean x=true;
        for (Sensor s:list)
        {
            
            if (s.isOn()==false)
            {
                x=false;
            }
            else
            {
                x=true;
            }
        }
        return x;
    }

    @Override
    public void on() 
    {
        for (Sensor s:list)
        {
            s.on();
        }
    }

    @Override
    public void off() 
    {
        for (Sensor s:list)
        {
            s.off();
        }
    }

    @Override
    public int measure() 
    {        
        int x = 0;
        for (Sensor s:list)
        {
            x+=s.measure();
        }
        readings.add(x/list.size());
        return x/list.size();
    }
    public List<Integer> readings()
    {
        return readings;
    }
    
}
