/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;
import reader.criteria.Criterion;

/**
 *
 * @author Intisar
 */
public class Both implements Criterion{
    private Criterion Criterion1;
    private Criterion Criterion2;
    public Both(Criterion Criterion1,Criterion Criterion2)
    {
        this.Criterion1=Criterion1;
        this.Criterion2=Criterion2;
    }
    @Override
    public boolean complies(String line) {
        if(Criterion1.complies(line) && Criterion2.complies(line)){
            return true;
        }
        else {
            return false;
        }
    }
    
}
