import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers:");
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        int numb = Integer.parseInt(reader.nextLine());
        while (numb != -1){
            sum = sum + numb;                            
            
            count += 1;
            if ((numb % 2) == 0){
                even +=1;
            }else{
                odd +=1;
            }
            numb = Integer.parseInt(reader.nextLine());
            
        }   double aveg = (double)sum / count;
            if (numb == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + aveg);
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                }
    }
}
