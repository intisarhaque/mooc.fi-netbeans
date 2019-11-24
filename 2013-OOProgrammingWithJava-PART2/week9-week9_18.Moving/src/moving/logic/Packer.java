/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import moving.domain.*;
import java.util.*;
/**
 *
 * @author Intisar
 */
public class Packer {
    private int boxesVolume;
    public Packer(int boxesVolume)
    {
        this.boxesVolume=boxesVolume;
    }
    public List<Box> packThings(List<Thing> things)
    {
        List<Box> boxes = new ArrayList<Box>();
        int thingsamount = things.size();
        for (Thing t:things)
        {
            Box B = new Box(this.boxesVolume);
            B.addThing(t);
            boxes.add(B);
        }
        return boxes;
        
    }
}
