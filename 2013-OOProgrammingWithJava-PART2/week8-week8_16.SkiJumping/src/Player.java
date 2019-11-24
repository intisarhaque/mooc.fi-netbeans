/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
import java.util.*;
public class Player implements Comparable<Player> {
    private String name;
    private int score;
    private ArrayList<Integer> jumps = new ArrayList<Integer>();
    
    public Player(String username)
    {
        this.name=username;
        this.score=0;
    }
    public int getScore()
    {
        return this.score;
    }
    public String getName()
    {
        return this.name;
    }
    public ArrayList<Integer> getJumps()
    {
        return this.jumps;
    }
    
    public int compareTo(Player p)
    {
        if (this.score>p.getScore())
        {
            return -1;
        }
        else if(this.score<p.getScore())
        {
            return +1;
        }
        else
        {
            return 0;
        }
                
    }
    public String toString()
    {
        return this.name + "(" + this.score + ") points";
    }
    public void addScore(int x)
    {
        this.score+=x;
    }
    public void addJump(int x)
    {
        jumps.add(x);
    }
    
}
