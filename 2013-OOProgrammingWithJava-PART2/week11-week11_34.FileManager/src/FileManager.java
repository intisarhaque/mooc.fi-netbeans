
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        ArrayList<String> texts = new ArrayList<String>();
        File x = new File(file);
        Scanner reader = new Scanner(x);
        while (reader.hasNextLine())
        {
            String line = reader.nextLine();
            texts.add(line );            
        }
        return texts;
        //return null;
    }

    public void save(String file, String text) throws IOException {
        FileWriter x = new FileWriter(file);
        x.write(text);
        x.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter x = new FileWriter(file);
        for (String z:texts)
        {
            x.write(z + "\n");
        }
        x.close();
    }
}
