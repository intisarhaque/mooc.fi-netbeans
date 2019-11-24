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
public class ShoppingBasket  {
    private Map<String, Purchase> purchases = new HashMap<String, Purchase>();
    
    public void add(String product, int price)
    {
        
        if (purchases.containsKey(product))
        {
            purchases.get(product).increaseAmount();                      
        }
        else
        {
            purchases.put(product, new Purchase("product", 1, price));
        }
    }
    public int price()
    {
        int x = 0;
        for (Purchase p:purchases.values())
        {
            int z = p.price();
            x +=z;
        }
        return x;
    }
    public void print()
    {
        Purchase p;
        for (String x: purchases.keySet())
        {
           p = purchases.get(x);
           System.out.println(x + ": " + p.amount());            
        }  
        
        
        
        
       
        
        
    }
    
}
