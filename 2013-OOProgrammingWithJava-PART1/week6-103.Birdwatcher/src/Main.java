import java.util.*;

public class Main {  

    public static void main(String[] args) 
    {
        ArrayList<Bird> list = new ArrayList<Bird>();
        askaway(list);    
    }
    public static void askaway(ArrayList<Bird> list)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("");
        String x = "";
        while (true)
        {
            System.out.println("?");
            x = reader.nextLine();
            if (x.equals("Quit"))
            {
                break;
            }
            else{
                action(x, reader, list);
            }
            
        }
    }
    public static void action(String x, Scanner reader, ArrayList<Bird> list)
    {
        
        if (x.equals("Add"))
        {
            System.out.println("Name: ");
            String y = reader.nextLine();
            System.out.println("Latin Name: ");
            String z = reader.nextLine();
            Bird bird = new Bird(y, z);
            list.add(bird);
        }
        else if(x.equals("Observation"))
        {
            System.out.println("What was observed:? ");
            String y = reader.nextLine();
            int parity = 0;
            for (Bird z:list)
            {
                
                if (z.getName().equals(y))
                {
                    
                    z.timesPlus();
                    parity +=1;
                    System.out.println("hi");
                }                
            }
            /*if (parity==0)
            {
                System.out.println("Is not a bird!");
            }*/
        }
        else if(x.equals("Statistics"))
        {
            for (Bird z:list)
            {
                System.out.println(z.getName()+" ("+z.getLatin()+"): "+z.getTimes()+" observations");
            }
        }
        else if(x.equals("Show"))
        {
            System.out.println("What? ");
            String y = reader.nextLine();
            int parity = 0;
            for (Bird z:list)
            {
                if (z.getName().equals(y))
                {
                    System.out.println(z.getName()+" ("+z.getLatin()+"): "+z.getTimes()+" observations");
                    parity +=1;
                }                
            }
            if (parity==0)
            {
                System.out.println("Is not a bird!");
            }
            
        }
       
    }
    

}
