/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author Intisar
 */
public class Film {
    private String name;
    
    public Film(String name)
    {
       this.name=name;        
    }
    public String toString()
    {
        return this.name;
    }
    public String getName()
    {
        return this.name;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 18 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (obj==null)
        {
            return false;
        }
        else if (obj.getClass()==this.getClass())
        {
            Film hold = (Film) obj;
            if (hold.getName().equals(this.getName()))
            {
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
}
