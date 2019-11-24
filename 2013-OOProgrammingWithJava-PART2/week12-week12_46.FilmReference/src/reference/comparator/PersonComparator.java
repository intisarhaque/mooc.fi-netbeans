/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author Intisar
 */
public class PersonComparator implements Comparator<Person>
{
    private Map<Person, Integer> peopleslist;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities)
    {
        this.peopleslist = peopleIdentities;
    }

    @Override
    public int compare(Person o1, Person o2) 
    {
        //return o1.getName().compareToIgnoreCase(o2.getName());
        //int x = peopleslist.get(o1);
        //int y = peopleslist.get(o2);
        int x=peopleslist.get(o1);
        int y= peopleslist.get(o2);
        
        if (x>y)
        {
            return -1;
        }
        if (x<y)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
   
}
