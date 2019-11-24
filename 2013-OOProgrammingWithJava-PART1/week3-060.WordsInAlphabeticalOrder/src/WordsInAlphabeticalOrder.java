
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void print(ArrayList<String> list) {
        for (String word : list) {
            System.out.println( word + "oi" );
    }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        list.add("C++");

        print(list);
    }
}
