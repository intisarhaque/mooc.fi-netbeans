
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    public static void addSuitcasesFullOfBricks(Container container)
    {
        
        for (int i=1; i<=100; i+=1)
        {
            Suitcase s = new Suitcase(100);
            Thing brick = new Thing("brick", i);
            s.addThing(brick);
            container.addSuitcase(s);
        }
    }
            

}
