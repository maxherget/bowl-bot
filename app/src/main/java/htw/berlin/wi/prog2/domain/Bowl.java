package htw.berlin.wi.prog2.domain;

import htw.berlin.wi.prog2.service.BowlBuilder;

import java.util.ArrayList;
import java.util.List;

public interface Bowl {
    double calculatePrice();
    int calculateCalories();
    List<String> getIngredientNames();
}
