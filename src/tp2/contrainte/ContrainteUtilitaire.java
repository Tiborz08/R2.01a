package tp2.contrainte;

import java.util.Scanner;

public class ContrainteUtilitaire {
    public static Note saisir(double min, double max) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Saisir une valeur entre " + min + " et " + max);
            double valeur = scanner.nextDouble();
            try {
                return new Note(valeur);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
