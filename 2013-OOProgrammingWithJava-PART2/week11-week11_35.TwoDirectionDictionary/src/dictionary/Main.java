package dictionary;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
     MindfulDictionary s = new MindfulDictionary("test/words.txt"); s.load(); s.remove("below"); s.add("tieokone", "computer"); s.save();

    }
}
