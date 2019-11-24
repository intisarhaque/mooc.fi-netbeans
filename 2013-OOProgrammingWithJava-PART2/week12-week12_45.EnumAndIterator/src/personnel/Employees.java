/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;
import java.util.*;
import java.util.Iterator;


/**
 *
 * @author Intisar
 */
public class Employees {
    private ArrayList<Person> employed;
    
    public Employees()
    {
        this.employed = new ArrayList<Person>();
    }
    
    public void add(Person person)
    {
        employed.add(person);
    }
    
    public void add(List<Person> persons)
    {
        for (Person p:persons)
        {
            employed.add(p);
        }
    }
    
    public void print()
    {
        Iterator<Person> iterator = employed.iterator();
        while ( iterator.hasNext() )
        {
            System.out.println(iterator.next());
        }
    }
    public void print(Education education)
    {
       
        for(Person p: employed)
        {
            if (p.getEducation()==education)
            {
                System.out.println(p);
            }
        }
        
    }
    
    public void fire(Education education)
    {
        Iterator<Person> iterator = employed.iterator();
        while (iterator.hasNext())
        {
            if (iterator.next().getEducation()==education)
            {
                iterator.remove();
            }
        }
    }
}
