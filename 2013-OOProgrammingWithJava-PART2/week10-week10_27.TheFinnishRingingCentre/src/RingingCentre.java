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
public class RingingCentre {
    private Map<Bird, Set<String>> list = new HashMap<Bird, Set<String>>();
            
    public void observe(Bird bird, String place)
    {
        if (list.containsKey(bird))
        {
            list.get(bird).add(place);
        }
        else
        {
            
            list.put(bird, new HashSet<String>());
            list.get(bird).add(place);
        }
    }
    public void observations(Bird bird)
    {
        
        
        if (list.containsKey(bird))
        {
            System.out.println(bird.latinName() + " (" + bird.ringingYear() + ") observations: " + list.get(bird).size());
            for (String location:list.get(bird))
            {
                System.out.println(location);
            }
        }
        else
        {
            System.out.println(bird.latinName() + " (" + bird.ringingYear() + ") observations: 0" );
        }
        
    }
    
}
