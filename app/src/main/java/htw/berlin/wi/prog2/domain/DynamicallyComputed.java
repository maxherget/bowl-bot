package htw.berlin.wi.prog2.domain;

import htw.berlin.wi.prog2.service.BowlBuilder;

import java.util.ArrayList;
import java.util.List;

public class DynamicallyComputed implements Bowl {
    List<Ingredient> specificIngredients = new ArrayList<>(BowlBuilder.zutaten);


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




    }
}
