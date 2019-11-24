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
public class LengthAtLeast implements Criterion {
    int least;
    public LengthAtLeast(int i) {
        this.least=i;
    }

    @Override
    public boolean complies(String line) {
        return(line.length()>=this.least);
    }
    
}
