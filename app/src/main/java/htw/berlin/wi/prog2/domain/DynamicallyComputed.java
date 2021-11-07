package htw.berlin.wi.prog2.domain;

import java.util.ArrayList;
import java.util.List;

public class DynamicallyComputed implements Bowl {
    private List<Ingredient> specificIngredients = new ArrayList<>();

    @Override
    public double calculatePrice() {
        double completePrice = 0;
        for (Ingredient a : specificIngredients) {
            completePrice = completePrice + a.getPrice();
        }
        return completePrice;
    }

    @Override
    public int calculateCalories() {
        int completeCalories = 0;
        for (Ingredient a : this.specificIngredients) {
            completeCalories = completeCalories + a.getCalories();
        }
        return completeCalories;
    }

    @Override
    public List<String> getIngredientNames() {
        List<String> ingredientsNames = new ArrayList<>();
        for (Ingredient a : specificIngredients) {
            ingredientsNames.add(a.getName());
        }
        return ingredientsNames;
    }

    public DynamicallyComputed (List<Ingredient> name) {
        specificIngredients = name;
    }



















    /*List<Ingredient> specificIngredients = new ArrayList<>(BowlBuilder.zutaten);


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
