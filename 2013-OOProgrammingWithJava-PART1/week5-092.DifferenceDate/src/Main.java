
public class Main {

    public static void main(String[] args) {
        // write testcode here
        MyDate first = new MyDate(2, 6, 2010);
        MyDate second = new MyDate(3, 1, 2011);
        MyDate third = new MyDate(2, 6, 2010);

        System.out.println( first + " and " + third + " difference in years: " + first.differenceInYears(third) );

        System.out.println( first + " and " + second + " difference in years: " + first.differenceInYears(second) );

        System.out.println( second + " and " + third + " difference in years: " + second.differenceInYears(third) );
    }
}
