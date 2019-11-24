
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String input = "translate\n" + "apina\n" +
                "translate\n" + "juusto\n" +
                "add\n" + "fag\n" + "gay\n" +
                "translate\n" + "fag\n" +
                "quit\n";
        
        Scanner reader = new Scanner(input);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}
