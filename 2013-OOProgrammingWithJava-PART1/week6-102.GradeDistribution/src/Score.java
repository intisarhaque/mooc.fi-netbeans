/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
public class Score {
    private String name;
    private int howmany;
    
    public Score(String name)
    {
        this.name=name;
        this.howmany=0;
    }
    public void scoreadd()
    {
        this.howmany+=1;
    }
    public String getName()
    {
        return this.name;
    }
    public int howmany()
    {
        return this.howmany;
    }

            
}
