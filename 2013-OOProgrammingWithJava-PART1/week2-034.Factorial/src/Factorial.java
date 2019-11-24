import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what?");
        int numb = Integer.parseInt(reader.nextLine());
        int count = 0;
        int sum = 1;
        while (count < numb){
            count +=1;
            sum *= count;
            
            
        }
        System.out.println(sum);
    }
}
