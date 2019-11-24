
public class Main {

    public static void main(String[] args) 
    {
        // Test your code hereNightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        
    }
}
