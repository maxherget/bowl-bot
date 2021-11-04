package htw.berlin.wi.prog2.domain;

import htw.berlin.wi.prog2.service.BowlBuilder;
import org.w3c.dom.css.ElementCSSInlineStyle;

import java.util.ArrayList;
import java.util.List;

public class PrecomputedBowl implements Bowl {

    List<Ingredient> specificIngredients = new ArrayList<>(BowlBuilder.Zutaten);
    int calories = BowlBuilder.Zutaten.get(0).getCalories() + BowlBuilder.Zutaten.get(1).getCalories();
    double price =  BowlBuilder.Zutaten.get(0).getPrice() + BowlBuilder.Zutaten.get(1).getPrice();




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
/*
public class PrecomputedBowl implements Bowl {
    Arraylist<Ingredient> =
    Ingredient Zutat2 =  BowlBuilder.Zutaten.get(0);
    Ingredient Zutat1 =  BowlBuilder.Zutaten.get(1);


    @Override
    public double calculatePrice() {
        double completePrice = Zutat1.getPrice() + Zutat2.getPrice();

        return completePrice;
    }

    @Override
    public int calculateCalories() {
        int completeCalories = Zutat1.getCalories() + Zutat2.getCalories();

        return completeCalories;
    }

    @Override
    public List<String> getIngredientNames() {

        return List.of( Zutat1.getName(),  Zutat2.getName());




    }
}
*/
