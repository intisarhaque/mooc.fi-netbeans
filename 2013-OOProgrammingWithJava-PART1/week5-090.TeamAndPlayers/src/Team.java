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
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name)
    {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
        
    }
    public String getName()
    {
        return this.name;
    }
    public void addPlayer(Player s)
    {
        if (players.size()<this.maxSize)
        {
          this.players.add(s);   
        }
               
    }
    public void printPlayers()
    {
        for (Player s:players)
        {
            System.out.println(s);
        }
    }
    public void setMaxSize(int maxSize)
    {
        this.maxSize = maxSize;
    }
    public int size()
    {
        return this.players.size();
    }
    public int goals()
    {
        int sum = 0;
        for (Player s: players)
        {
            int x = s.goals();
            sum +=x;
        }
        return sum;
    }
}
