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
public class TextUserInterface {
    private Scanner reader;
    private Flights flightList;
    private ArrayList<Plane> planeList = new ArrayList<Plane>();

    public TextUserInterface(Scanner reader, Flights list)
    {
        this.reader=reader;
        this.flightList=list;
    }     

    public void start()
    {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        airportPanel();
        System.out.println("");
        System.out.println("Flight service");
        System.out.println("------------");
        flightService();         
    }

    public void airportPanel()
    {
        while(true)
        {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.println("> ");
            String option1 = reader.nextLine();
            if (option1.equals("x"))
            {
                break;
            }
            else if (option1.equals("1"))
            {

                System.out.println("Give plane ID: ");
                String ID = reader.nextLine();
                System.out.println("Give plane capacity: ");
                int cap = Integer.parseInt(reader.nextLine());
                Plane p = new Plane(ID,cap);
                planeList.add(p);
            }
            else if (option1.equals("2"))
            {
                System.out.println("Give plane ID: ");
                String givenID = reader.nextLine();
                System.out.println("Give departure airport code: ");
                String dep = reader.nextLine();
                System.out.println("Give destination airport code: ");
                String des = reader.nextLine();
                String depAnddes = dep+"-"+des;
                flightList.add(givenID, depAnddes, planeList);
            }

        }
    }
    public void flightService()
    {
        while(true)
        {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.println("> ");
            String option2 = reader.nextLine();
            if (option2.equals("x"))
            {
                break;
            }
            else if (option2.equals("1"))
            {
                for (Plane p:planeList)
                {
                    System.out.println(p.iD() + " (" + p.capaCity() + " ppl)");
                }
            }
            else if (option2.equals("2"))
            {
                flightList.printflights();
            }
            else if (option2.equals("3"))
            {
                System.out.print("Give plane ID: ");
                String givenID = reader.nextLine();
                for (Plane p:planeList)
                {
                    if (p.iD().equals(givenID))
                    {
                        System.out.println(p.iD() + " (" + p.capaCity() + " ppl)");
                    }
                }
            }
            
        }
    }
    
    
}
