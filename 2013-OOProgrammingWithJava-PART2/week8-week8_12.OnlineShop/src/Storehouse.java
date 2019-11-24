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
public class Storehouse {
    private Map<String, Integer> storesproduct =  new HashMap<String, Integer>();
    private Map<String, Integer> storess =  new HashMap<String, Integer>();
    public void addProduct(String product, int price, int stock)
    {
        storesproduct.put(product, price);
        storess.put(product, stock);
    }
    public int price(String product)
    {
        if (storesproduct.containsKey(product))
        {
            return storesproduct.get(product);
        }
        else 
        {
            return -99;
        }
    }
    public int stock(String product)
    {
        if (storess.containsKey(product))
        {
            return storess.get(product);
        }
        else 
        {
            return 0;
        }
    }
    public boolean take(String product)
    {
        if (storess.containsKey(product))
        {
           if (storess.get(product)>0)
           {
               storess.put(product, storess.get(product)-1);
               return true;
           }
           else
           {
               
               return false;
           }
        }
        else
        {
            return false;
        }
    }
    public Set<String> products()
    {
        Set<String> names = new HashSet<String>();
        
        for (String products: storesproduct.keySet())
        {
            names.add(products);
        }
        return names;
    }
    
}
