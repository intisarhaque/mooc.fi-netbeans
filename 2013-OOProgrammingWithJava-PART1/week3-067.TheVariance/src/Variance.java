import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int bleg = 0;
        for (int sumb : list) {
            bleg += sumb;
    }
        
        return bleg;
        
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double ave = (double)(sum(list)) / (list.size());
        return ave;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double var = 0;
        double aveg = average(list);
        for (int numb : list){
            double meg = (numb-aveg)*(numb-aveg);
            var += meg;
        }
        System.out.println(var);
        double beg = list.size()-1;
        var = var/beg;
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The sum is: " + sum(list));
        System.out.println("The average is: " + average(list));
        System.out.println("The variance is: " + variance(list));
    }

}
