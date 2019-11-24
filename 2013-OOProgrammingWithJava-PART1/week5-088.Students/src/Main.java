
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       
        // write here the main program
        ArrayList <Student> students = new ArrayList<Student>();
        while (true)
        {
            System.out.println("name: ");
            String x = reader.nextLine();
            if (x.length()==0)
            {
                break;
            }
            System.out.println("studentnumber: ");
            String y = reader.nextLine();
            if (x.length()==0||y.length()==0)
            {
                break;
            }
            Student s = new Student(x, y);
            students.add(s);
        }
        for (Student y : students)
        {
            System.out.println(y);
        }
        
        
        ArrayList <Student> search = new ArrayList<Student>();
        System.out.println("Give search term: ");
        String a = reader.nextLine();
        for (Student y: students)
        {
            
            if (y.getName().contains(a))
            {
                search.add(y);
            }
                    
        }
        System.out.println("Result:");
        for (Student y : search)
        {
            System.out.println(y);
        }
        
    }
}