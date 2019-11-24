/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Intisar
 */
public class FilmComparator implements Comparator<Film> 
{
    private Map<Film, List<Rating>> filmratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings)
    {
        this.filmratings = ratings;
    }
    
    

    @Override
    public int compare(Film o1, Film o2) 
    {
        
        ArrayList x = (ArrayList)filmratings.get(o1);
        Iterator<Rating> iterator1 = x.iterator();
        int xsum=0;
        while (iterator1.hasNext())
        {
            int a = iterator1.next().getValue();
            xsum+=a;
        }
        double xave = (double)xsum/x.size();
        ArrayList y = (ArrayList)filmratings.get(o2);
        Iterator<Rating> iterator2 = y.iterator();
        int ysum=0;
        while (iterator2.hasNext())
        {
            int a = iterator2.next().getValue();
            ysum+=a;
        }
        double yave = (double)ysum/y.size();
        if (xave>yave)
        {
            return -1;
        }
        else if (xave<yave)
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
       
        
        
        
        
        
        
    }
    
}
