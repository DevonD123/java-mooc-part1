
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    public void addMeal(String meal){
        if(!this.meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    public void printMeals(){
        for (String mealVal : meals) {
            System.out.println(mealVal);
        }
    }
    public void clearMenu(){
        if(this.meals.size() >= 1){
            meals.clear();
        }
    }
    // add the methods here
}
