package exercice3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Cette classe permet de choisir un élément au hasard à partir d'une liste d'éléments.
 */

public class PickRandomElementFromArray {

    /**
     * Cette méthode prend en entrée une liste d'éléments de type `String` et retourne un élément choisi au hasard.
     *
     * @param values la liste d'éléments à partir de laquelle un élément sera choisi
     * @return un élément choisi au hasard de la liste `values`
     */
    public static String random(ArrayList<String> values) {
        int randomIndex = new Random().nextInt(0, values.size());
        return values.get(randomIndex);
    }

}
