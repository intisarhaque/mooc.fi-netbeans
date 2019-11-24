import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GradeList list = new GradeList();
        String[] titles = {"0", "1", "2", "3", "4", "5"};
        list.addtoList(titles);     
        list.ask(reader);
        list.printGrades();
        
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}

/*Score zero = new Score();        
        Score one = new Score();
        Score two = new Score();
        Score three = new Score();
        Score four = new Score();
        Score five = new Score();*/