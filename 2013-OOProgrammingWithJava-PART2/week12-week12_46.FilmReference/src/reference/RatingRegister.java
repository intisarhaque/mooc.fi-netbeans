/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Intisar
 */
public class RatingRegister {
    Map<Film, List<Rating>> ratings;
    Map<Person, Map<Film, Rating>> peopleratings;
    public RatingRegister()
    {
        ratings = new HashMap<Film,List<Rating>>();
        peopleratings  = new HashMap<Person, Map<Film, Rating>>();
    }
    public void addRating(Film film, Rating rating)
    {
        if(ratings.containsKey(film))
        {
            ratings.get(film).add(rating);
        }
        else
        {
            ratings.put(film, new ArrayList<Rating>());
            ratings.get(film).add(rating);
        }
    }
    public void addRating(Person person, Film film, Rating rating)
    {
        if (!peopleratings.containsKey(person))
        {
            peopleratings.put(person, new HashMap<Film, Rating>());
            peopleratings.get(person).put(film, rating);
        }
        else
        {
            peopleratings.get(person).put(film, rating);
        }
        addRating(film, rating);
    }
    public List<Rating> getRatings(Film film)
    {

        return ratings.get(film);       

    }
    public Map<Film, List<Rating>> filmRatings()
    {
       return ratings;       
    }
    public Rating getRating(Person person, Film film)
    {
        if (peopleratings.containsKey(person))
        {
            if (peopleratings.get(person).containsKey(film))
            {
                return peopleratings.get(person).get(film);
            }
            else
            {
                return Rating.NOT_WATCHED;
            }
        }
        else
        {
            return Rating.NOT_WATCHED;
        }
    }
    public Map<Film, Rating> getPersonalRatings(Person person)
    {
        //HashMap<Film, Rating> personalratings = new HashMap<Film, Rating>();
        if (peopleratings.containsKey(person))
        {
            return peopleratings.get(person);
        }
        else
        {
            return new HashMap<Film, Rating>();
        }
        
    }
    public List<Person> reviewers()
    {
        ArrayList<Person> people = new ArrayList<Person>(peopleratings.keySet());
        return people;
        
    }
}
