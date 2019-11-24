/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Intisar
 */
public class OneThingBox extends Box {
    private Thing only;
    
    @Override
    public void add(Thing thing) {
        if (only==null)
        {
            only=thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (only!=null)
        {
            if (only.equals(thing))
            {
            return true;
            }
            else
            {
                return false;
            }
        }
        else return false;
        
    }
    
}
