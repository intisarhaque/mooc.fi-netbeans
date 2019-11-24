/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
public class Person {
    private String name;
    private String Number;
    
    public Person(String name, String Number)
    {
        this.name=name;
        this.Number=Number;
    }
    
    public void changeNumber(String newNumber)
    {
        this.Number=newNumber;
    }
    
    public String toString()
    {
        return (this.name + " number: " + this.Number);
    }
    public String getName()
    {
        return this.name;
    }
    public String getNumber()
    {
        return this.Number;
    }
}
