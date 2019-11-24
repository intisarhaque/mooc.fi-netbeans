/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.Collections;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import reference.domain.*;
import java.util.*;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;

/**
 *
 * @author Intisar
 */
public class Reference {
    private RatingRegister ratings;
    
    public Reference(RatingRegister a)
    {
        this.ratings=a;
    }
    
    public Film recommendFilm(Person p)
    {
        FilmComparator filmComparator = new FilmComparator(ratings.filmRatings());
                List<Film> films = new ArrayList<Film>();
                for(Film film : ratings.filmRatings().keySet()){
                    films.add(film);
                }
                Collections.sort(films, filmComparator);
                for(Film film : ratings.getPersonalRatings(p).keySet()){
                    if(ratings.getPersonalRatings(p).get(film) != Rating.NOT_WATCHED){
                        films.remove(film);
                    }
                }
                if(films.size() == 0){
                    return null;
                }
                else {
                    return films.get(0);
                }
        
    }
  
}
