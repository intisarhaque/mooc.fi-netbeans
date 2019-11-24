/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Intisar
 */
public class Not implements Criterion{
    private Criterion Criterion;
    
    public Not(Criterion Criterion)
    {
        this.Criterion=Criterion;
    }

    @Override
    public boolean complies(String line) {
        if (!Criterion.complies(line))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
