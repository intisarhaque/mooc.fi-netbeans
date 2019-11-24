/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
import java.util.*;
public class Flights {
    private HashMap<Plane, String> flightList = new HashMap<Plane, String>();
    
    public void add(String ID, String airportCode, ArrayList<Plane> planeList)
    {
        
        for (Plane p: planeList)
        {
            if (p.iD().equals(ID))
            {
                if (flightList.containsKey(p))
                {
                    Plane z = p;
                    flightList.put(z, airportCode);
                    
                }
                else
                {
                    flightList.put(p, airportCode);
                }
                
            }                   
        }               
        
    }
    public void printflights()
    {
        for (Plane p:flightList.keySet())
        {
            System.out.println(p.iD() + " (" + p.capaCity() + " ppl)" + " (" + flightList.get(p)+")");
        }
    }
    public void planeInfo(String x)
    {
        for (Plane p:flightList.keySet())
        {
            if (p.iD().equals(x))
            {
                System.out.println(p.iD() + " (" + p.capaCity() + " ppl)");
            }
        }
    }
}
