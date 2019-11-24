/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;

/**
 *
 * @author Intisar
 */
public class AtLeastOne implements Criterion {
    private ArrayList<Criterion> criterions = new ArrayList<Criterion>();
            
    public AtLeastOne(Criterion... criteria)
    {
        int x = criteria.length;
        for (int i=0; i<x; i+=1)
        {
            this.criterions.add(criteria[i]);
        }
    }
    @Override
    public boolean complies(String line) {
        int boole = 0;
        for (Criterion c:criterions)
        {
            if (c.complies(line))
            {
                boole+=1;
            }
        }
        if (boole>0)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    
}
