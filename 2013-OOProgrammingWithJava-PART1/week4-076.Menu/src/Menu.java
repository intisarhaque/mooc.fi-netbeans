
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;
    
    
    public void addMeal(String meal){
            if (meals.contains(meal)){
                
            }else{
                meals.add(meal);
            }                   
                      
    }
    public void clearMenu(){
        meals.removeAll(meals);
        
        
    }
    public void printMeals(){
        for (String word:meals){
            System.out.println(word);
        }
        
        
    }
    

    public Menu() {
        this.meals = new ArrayList<String>();
        
        
    }

    // add the methods here
}
