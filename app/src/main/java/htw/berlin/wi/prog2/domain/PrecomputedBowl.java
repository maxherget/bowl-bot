package htw.berlin.wi.prog2.domain;

import java.util.ArrayList;
import java.util.List;

public class PrecomputedBowl implements Bowl {
    private double completePrice = 0;
    private int completeCalories = 0;
    private List<Ingredient> specificIngredients = new ArrayList<>();
   ;

    @Override
    public double calculatePrice() {
        for (Ingredient a : specificIngredients) {
            this.completePrice = completePrice + a.getPrice();
        }
        return completePrice;
    }
    @Override
    public int calculateCalories() {
        for (Ingredient a : this.specificIngredients) {
            this.completeCalories = this.completeCalories + a.getCalories();
        }
        return this.completeCalories;
    }

    @Override
    public List<String> getIngredientNames() {
        List<String> ingredientsNames = new ArrayList<>();
        for (Ingredient a : specificIngredients) {
            ingredientsNames.add(a.getName());
        }
        return ingredientsNames;
    }

    public PrecomputedBowl (List<Ingredient> name, double price, int calories ){
        specificIngredients = name;
        completePrice = price ;
        completeCalories = calories;
    }








    /*  List<Ingredient> specificIngredients = new ArrayList<>(BowlBuilder.zutaten);
    int calories = BowlBuilder.zutaten.get(0).getCalories() + BowlBuilder.zutaten.get(1).getCalories();
    double price =  BowlBuilder.zutaten.get(0).getPrice() + BowlBuilder.zutaten.get(1).getPrice();


    @Override
    public double calculatePrice() {
        return specificIngredients.get(0).getPrice() + specificIngredients.get(1).getPrice();
    }

    @Override
    public int calculateCalories() {
        return specificIngredients.get(0).getCalories() + specificIngredients.get(1).getCalories();
    }

    @Override
    public List<String> getIngredientNames() {
      return List.of(specificIngredients.get(1).getName() , specificIngredients.get(0).getName());



    }*/
}
