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
public class Plane {
    private String ID;
    private int Capacity;
    
    
    public Plane(String x, int y)
    {
        this.ID=x;
        this.Capacity=y;
    }
    
    public String iD()
    {
        return this.ID;
    }
    public int capaCity()
    {
        return this.Capacity;
    }
}
