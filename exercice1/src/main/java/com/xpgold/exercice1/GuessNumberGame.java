package com.xpgold.exercice1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private static Scanner scanner = new Scanner(System.in);
    private static int nbreJeux = 0;
    private static int nbreVictoire = 0;
    private static int nbreDefaite = 0;

    public static void main(String[] args) {
        while (true) {
            int generateNumber = new Random().nextInt(1000) + 1;
            int nbreTentativesJeux = 5;
            int inputUser;
            nbreJeux++;

            System.out.println("Un nombre compris entre 1 et 1000 a été généré par l'ordinateur. Essayez de le deviner, vous avez 5 chances!");

            while (nbreTentativesJeux > 0) {
                inputUser = scanner.nextInt();
                nbreTentativesJeux--;
                if (inputUser == generateNumber) {
                    System.out.println("Bravo, vous avez trouvé le nombre en " + (5 - nbreTentativesJeux) + " essais !");
                    nbreVictoire++;
                    break;
                } else if (inputUser > generateNumber) {
                    System.out.println("Votre nombre est plus grand que celui généré par l'ordinateur. Il vous reste " + nbreTentativesJeux + " essai(s).");
                } else {
                    System.out.println("Votre nombre est plus petit que celui généré par l'ordinateur. Il vous reste " + nbreTentativesJeux + " essai(s).");
                }
            }

            if (nbreTentativesJeux == 0) {
                System.out.println("Désolé, vous avez perdu. Le nombre était " + generateNumber + ".");
                nbreDefaite++;
            }

            System.out.println("Voulez-vous jouer à nouveau ? (Oui/Non)");
            String reponse = scanner.next();
            if (!reponse.equalsIgnoreCase("Oui")) {
                break;
            }
        }

        System.out.println("Vous avez joué " + nbreJeux + " fois");
        System.out.println("Vous avez gagné " + nbreVictoire + " fois");
        System.out.println("Vous avez perdu " + nbreDefaite + " fois");
    }
}
