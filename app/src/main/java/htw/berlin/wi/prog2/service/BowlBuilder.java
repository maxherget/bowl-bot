package htw.berlin.wi.prog2.service;

import htw.berlin.wi.prog2.domain.*;

import java.util.ArrayList;
import java.util.List;

public class BowlBuilder {
    public static List<Ingredient> Zutaten = new ArrayList<>();

    public BowlBuilder add(Ingredient ingredient) {
        // TODO hier die Annahme von Zutaten implementieren
        int a = 0;
        Zutaten.add(a,ingredient);
          a = a + 1;
        return this; // die Rückgabe von this sollte beibehalten bleiben (siehe Benutzung im BowlBuilderTest)
    }

    public Bowl buildPrecomputed() {
        // TODO hier stattdessen die neue Klasse PrecomputedBowl verwenden
        return new PrecomputedBowl();
    }

    public Bowl buildDynamicallyComputed() {
        // TODO hier stattdessen die neue Klasse DynamicallyComputedBowl verwenden
        return new DynamicallyComputed();
    }
}
