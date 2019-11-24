import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String name = reader.nextLine();
        System.out.println("Length of the end part: ");
        int numb = Integer.parseInt(reader.nextLine());
        int leng = name.length() - numb;
        int end = name.length();
        System.out.println("Result: " + name.substring(leng,end ));
    }
}
