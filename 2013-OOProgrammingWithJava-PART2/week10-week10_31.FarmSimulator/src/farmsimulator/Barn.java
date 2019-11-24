/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.*;
/**
 *
 * @author Intisar
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    public Barn(BulkTank tank)
    {
        this.tank=tank;
    }
    public BulkTank getBulkTank()
    {
        return this.tank;
    }
    public void installMilkingRobot(MilkingRobot milkingRobot)        
    {
        this.robot=milkingRobot;
    }
    public void takeCareOf(Cow cow)        
    {
        if (this.robot!=null)
        {
            tank.addToTank(cow.milk());
        }
        else
        {
            
        }
    }
    public void takeCareOf(Collection<Cow> cows)        
    {
        for (Cow cow:cows)
        {
            if (this.robot!=null)
            {
                tank.addToTank(cow.milk());
            }
        else
            {

            }
        }
    }
    public String toString()        
    {
        return "Barn: " + tank.toString();
    }
            
            
}
