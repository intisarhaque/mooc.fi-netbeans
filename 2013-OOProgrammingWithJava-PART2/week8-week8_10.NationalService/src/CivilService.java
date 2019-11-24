/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
public class CivilService implements NationalService{
    private int daysLeft = 362;
    
    public void work()
    {
        if (this.daysLeft>0)
        {
            this.daysLeft-=1;
        }
    }
    public int getDaysLeft()
    {
        return this.daysLeft;
    }
    
}
