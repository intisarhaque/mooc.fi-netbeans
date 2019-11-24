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
public class SortLowest implements Comparator<Player> {
    
    public int compare(Player a, Player b)
    {
        if (a.getScore()>b.getScore())
        {
            return 1;
        }
        else if(a.getScore()<b.getScore())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
}
