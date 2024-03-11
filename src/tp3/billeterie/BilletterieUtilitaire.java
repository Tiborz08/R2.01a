package tp3.billeterie;

import java.util.ArrayList;

public class BilletterieUtilitaire {
    /**
     * Arrondit un prix à deux décimales.
     * @param prix le prix à arrondir
     * @return le prix arrondi à deux décimales
     */
    public static double arrondir(double prix) {
        return Math.round(prix * 100) / 100.0;
    }
    public static void afficheBillets(ArrayList<Billet> billet) {
        for (Billet b : billet) {
            System.out.println(b);
            System.out.println("Prix : " + arrondir(b.getPrixAuKm()));
        }
    }
    public static void afficheTrajets(ArrayList<Trajet> trajet) {
        for (Trajet t : trajet) {
            System.out.println(t);
        }
    }
}
