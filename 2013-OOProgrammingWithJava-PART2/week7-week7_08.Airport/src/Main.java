
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String y ="x\n" + "x\n";
        Scanner reader = new Scanner(System.in);
        Flights x = new Flights();
        TextUserInterface ui = new TextUserInterface(reader, x);
        ui.start();
        
        //Plane g = new Plane("gr", 25);
        //System.out.println(g.toString());
        // Write your main program here. Implementing your own classes will be useful.
    }
}
