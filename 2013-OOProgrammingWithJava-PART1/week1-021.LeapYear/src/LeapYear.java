
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year:");
        
        int year = Integer.parseInt(reader.nextLine());
        int fouryear = year % 4;
        int hundredyear = year % 100;
        int fourhundredyear = year % 400;
        
        if (fouryear == 0 && hundredyear != 0 ){
            System.out.println("The year is a leap year");
        }
        else if (fouryear == 0 && hundredyear==0 && fourhundredyear==0){
            System.out.println("The year is a leap year");
        }else{
            System.out.println("The year is not a leap year");
        }

    }
}
