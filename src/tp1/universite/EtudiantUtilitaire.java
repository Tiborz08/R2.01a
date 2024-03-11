package tp1.universite;

/**
 * La classe EtudiantUtilitaire contient des méthodes utilitaires pour la classe Etudiant
 */
public class EtudiantUtilitaire {
    /**
     * Mettre la première lettre de la chaine en majuscule
     *
     * @param chaine La chaine à modifier
     * @return La chaine avec la première lettre en majuscule
     */
    public static String capitalize(String chaine) {
        return chaine.substring(0, 1).toUpperCase() + chaine.substring(1).toLowerCase();
    }
}
