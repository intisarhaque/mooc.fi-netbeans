
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top ten based on goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 based on penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Sydney Crosby statistics:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Philadelphia Flyers statistics:");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("Anaheim Ducks by points:");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
    }
}
