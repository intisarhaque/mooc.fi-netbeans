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
public class Library {
    private ArrayList<Book> list;
    
    public Library()
    {
        this.list = new ArrayList<Book>();
    }
    public void addBook(Book newBook)
    {
        list.add(newBook);
    }
    public void printBooks()
    {
        for (Book b:list)
        {
            System.out.println(b);
        }
    }
    public ArrayList<Book> searchByTitle(String title)
    {
        String tittle = title.toUpperCase().trim();
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b: list)
        {
            String newtittle = b.title().toUpperCase().trim();
            if (StringUtils.included(b.title(), tittle))
            {
                found.add(b);
                
            }
            else
            {
                continue;
            }
        }
        return found;
        
    }
    public ArrayList<Book> searchByPublisher(String publisher) 
    {
        String pubblisher = publisher.toUpperCase().trim();
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b: list)
        {
            String newpubblisher = b.publisher().toUpperCase().trim();
            if (StringUtils.included(b.publisher(), pubblisher))
            {
                found.add(b);
            }
            else
            {
                continue;
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b: list)
        {
            if (b.year()==year)
            {
                found.add(b);
            }
            else
            {
                continue;
            }
        }
        return found;
    }
}
