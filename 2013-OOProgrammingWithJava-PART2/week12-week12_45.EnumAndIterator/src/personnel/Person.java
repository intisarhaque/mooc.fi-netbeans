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
public class Person {
    private String Person;
    private Education education;
    
    public Person(String Person, Education education)
    {
        this.Person=Person;
        this.education=education;
    }
    
    public String toString()
    {
        return(this.Person + ", " + this.education);
    }
    
    public Education getEducation()
    {
        return this.education;
    }
}
