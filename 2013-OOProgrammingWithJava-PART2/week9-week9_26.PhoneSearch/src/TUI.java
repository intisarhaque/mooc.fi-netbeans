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
public class TUI implements search{
    private Scanner reader;
    private Map<String, ArrayList<String>> numbers;
    private Map<String, String> address;
    
    
    public TUI(Scanner reader)
    {
        this.reader=reader;
        numbers = new HashMap<String, ArrayList<String>>();
        address = new HashMap<String, String>();
    }
    
    public void start()
    {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        command();
    }
    
    public void command()
    {
        while (true)
        {
            System.out.print("command: ");
            String x = reader.next();
            if (x.equals("1"))
            {
                addNum();
            }
            if (x.equals("2"))
            {
                searchNum();
            }
            if (x.equals("3"))
            {
                searchPerson();
            }
            if (x.equals("4"))
            {
                addAdd();
            }
            if (x.equals("5"))
            {
                searchInfo();
            }
            if (x.equals("6"))
            {
                deleteInfo();
            }
            if (x.equals("7"))
            {
                filter();
            }
            if (x.equals("x"))
            {
                break;
            }
        }
    }
    @Override
    public void addNum() {
        
    }

    @Override
    public void searchNum() {
    }

    @Override
    public void searchPerson() {
    }

    @Override
    public void addAdd() {
    }

    @Override
    public void searchInfo() {
    }

    @Override
    public void deleteInfo() {
    }

    @Override
    public void filter() {
    }
    
}
