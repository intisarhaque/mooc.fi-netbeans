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
public class EndsWithQuestionOrExclamationMark implements Criterion{
    
    @Override
    public boolean complies(String line) {
        int x = line.length();
        if (x>0&&(line.charAt(x-1)=='!'||line.charAt(x-1)=='?'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
