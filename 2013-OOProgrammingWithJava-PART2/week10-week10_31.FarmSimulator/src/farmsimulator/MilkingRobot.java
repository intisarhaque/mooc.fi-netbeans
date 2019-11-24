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
public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot() 
    {
        
    }
    public BulkTank getBulkTank() 
    {
        if (tank !=null)
        {
            return tank;
        }
        else
        {
            return null;
        }
    }
    public void setBulkTank(BulkTank tank) 
    {
        this.tank=tank;
    }
    public void milk(Milkable milkable)
    {
        if (tank!=null)
        {
            tank.addToTank(milkable.milk());
        }
        else
        {
            
        }
    }
    
}
