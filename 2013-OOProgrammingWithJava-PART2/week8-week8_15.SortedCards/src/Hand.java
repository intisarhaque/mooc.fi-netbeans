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
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand = new ArrayList<Card>();
    
    public void add(Card card)
    {
        hand.add(card);
    }
    public void print()
    {
        //hand.toArray();
        //Collections.sort(hand);
        for (Card c:hand)
        {
            System.out.println(c);
        }
    }
    public void sort() 
    {
        
        Collections.sort(hand);
    }
    
    public void sortAgainstSuit()
    {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
    
    public int compareTo(Hand h)
    {
        int aich = 0;
        int thiss = 0;
        for (Card c: this.hand)
        {
            thiss += c.getValue();
        }
        for (Card c: h.hand)
        {
            aich += c.getValue();
        }
        if (thiss>aich)
        {
            return 1;
        }
        else if (thiss<aich)
        {
            return -1;
        }   
        else
        {
            return 0;
        }
    }
}
