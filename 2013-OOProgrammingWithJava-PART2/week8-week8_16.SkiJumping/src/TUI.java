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
public class TUI {  
    private Scanner reader;
    private ArrayList<Player> players = new ArrayList<Player>();
    
    public TUI(Scanner reader)
    {
        this.reader=reader;
    }
    public void start()
    {
        System.out.println("Kumpula ski jumping week");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        getPlayers();
        startJump();
    }
    public void getPlayers()
    {
        while (true)
        {
            System.out.print("  Participant name: ");
            String x = reader.nextLine();
            if (x.length()==0)
            {
                break;
            }
            else
            {
                Player p = new Player(x);
                players.add(p);
            }
            
        }
    }
    public void startJump()
    {
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        int round = 1;
        while (true)
        {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String x = reader.nextLine();
            if (x.equals("jump"))
            {
                System.out.println("");
                System.out.println("Round " + round);
                System.out.println("");
                System.out.println("Jumping order: ");
                jumpingOrder();
                doRound(round);
                round +=1;
            }            
            else
            {
                endingMessage();
                break;
            }
            
        }
    }
    public void doRound(int round)
    {
        System.out.println("");
        System.out.println("Results of round " + round);
        for (Player P: players)
        {
            System.out.println("  " + P.getName());
            Random r = new Random();
            int x = r.nextInt(61)+60;
            Integer[] list = new Integer[5];
            ArrayList<Integer> fuckyoucode = new ArrayList<Integer>();
            for (int i=0;i<5;i+=1)
            {
                int g = r.nextInt(6)+11;
                fuckyoucode.add(g);
                list[i]=g;
            }
            String judges="";            
            System.out.println("    length: " + x);
            System.out.print("    judge votes: [");
            for (int z = 0; z<4;z+=1)
            {
                System.out.print(list[z]+",");
            }
            System.out.println(list[4]+"]");    
            Collections.sort(fuckyoucode);
            Collections.reverse(fuckyoucode);
            P.addJump(x);
            int sum = x;
            for (int i=1;i<4;i+=1)
            {
                sum +=fuckyoucode.get(i);
            }
            P.addScore(sum);
            
            
            
        }
        System.out.println("");
    }
    public void jumpingOrder()
    {
        Collections.sort(players,new SortLowest());
        for (Player p:players)
        {
            System.out.println("  " + (players.indexOf(p)+1) + ". " + p.getName()+ " (" + p.getScore() + " points)");
        }
    }
    public void playGame(int round)
    {
        for (Player P: players)
        {
            System.out.println(P);
        }
    }
    public void endingMessage()
    {
        System.out.println("");
        System.out.println("Thanks! ");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(players);
        for (Player P:players)
        {
            System.out.println((players.indexOf(P)+1) +"           " +P.getName()+ " (" + P.getScore() + " points)"  );
            System.out.print("            jump lengths: ");
            Integer[] jumps = new Integer[P.getJumps().size()];            
            for (int i=0; i<P.getJumps().size()-1;i+=1)
            {
                System.out.print(P.getJumps().get(i)+ " m, ");
            }
            System.out.println(P.getJumps().get(P.getJumps().size()-1) + " m");
        }
    }
            
    
}
