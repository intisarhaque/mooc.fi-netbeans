import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        boolean check = true;
        int z = 0;
        for (int i=0; i<7;i+=1)
        {           
            while (1==1){
                z = this.random.nextInt(39)+1;
                if (containsNumber(z)==false){
                numbers.add(z);
                break;
                }
            }                   
        }
        
        // Write the number drawing here using the method containsNumber()
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (numbers.contains(number))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}