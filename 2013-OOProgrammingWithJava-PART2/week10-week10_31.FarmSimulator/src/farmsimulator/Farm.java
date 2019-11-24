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
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows;
    public Farm(String name, Barn barn)
    {
        this.owner=name;
        this.barn=barn;
        this.cows = new ArrayList<Cow>();
    }
    public void addCow(Cow cow)
    {
        cows.add(cow);
    }

    @Override
    public void liveHour() {
        for (Cow cow: cows)
        {
            cow.liveHour();
        }
    }
    public String getOwner()
    {
        return this.owner;
    }
    public void  manageCows()
    {
        barn.takeCareOf(cows);
    }
    public void installMilkingRobot(MilkingRobot robot)
    {
        barn.installMilkingRobot(robot);
    }
    public String toString()
    {
        String x = "";
        for (Cow cow: cows)
        {
            x += "        " + cow.toString() + "\n";
        }
        return "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + 
                barn.getBulkTank().getVolume() + "/" + barn.getBulkTank().getCapacity()
                + "\nAnimals: \n" + x;
                
    }
    
}
