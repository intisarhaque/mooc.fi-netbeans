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
public class Phonebook {
    private ArrayList<Person> list;
    public Phonebook()
    {
        this.list=new ArrayList<Person>();
    }
    public void add(String name, String number)
    {
        Person s = new Person(name, number);
        this.list.add(s);
    }
    public void printAll()
    {
        for (Person s:this.list)
        {
            System.out.println(s);
        }
    }
     public String searchNumber(String name)
     {
         Person d = new Person("", "");
         for (Person s: this.list)
         {
             if (name==s.getName())
             {
                 d = s;
             }
             if (d.getName()=="")
             {
                 d.changeNumber("number not known");
             }
             
         }
         return d.getNumber();
     }
    
    
}
