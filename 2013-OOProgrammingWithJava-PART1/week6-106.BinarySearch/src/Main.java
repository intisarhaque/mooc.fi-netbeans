
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] taulukko = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(taulukko));
        System.out.println();

        System.out.print("Enter searched number: ");
        String input = reader.nextLine();
        System.out.println();

        boolean check = BinarySearch.search(taulukko, Integer.parseInt(input));
        if (check==true)
        {
            System.out.println("Value "+input+" is not in the array");
        }

        // Print here the result
    }
}
