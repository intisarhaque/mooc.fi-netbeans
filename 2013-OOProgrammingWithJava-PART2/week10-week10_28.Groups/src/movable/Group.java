/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;
import java.util.*;
/**
 *
 * @author Intisar
 */
public class Group implements Movable{
    private ArrayList<Movable> list = new ArrayList<Movable>();
    public Group()
    {
        
    }
    
    public void addToGroup(Movable movable)
    {
        list.add(movable);
    }
    public String toString()
    {
        String blegh = "";
        for (Object b: list)
        {
            Organism a = (Organism) b;
            blegh +=a.toString() + "\n";
        }
        
        return blegh;
        
        
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable b: list)
        {
            
            b.move(dx, dy);
        }
    }
    
}
