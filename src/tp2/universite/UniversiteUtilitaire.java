package tp2.universite;

public class UniversiteUtilitaire {
    public static void affichePersonne(Personne personne) {
        System.out.println("Login: " + personne.getLogin());
        System.out.println("Nom complet: " + personne.getNomComplet());
        System.out.println("Mail: " + personne.getMail());
        System.out.println("Adresse: " + personne.getAdressePersonne());
    }
    public static void affichePersonnel(Personnel personnel) {
        affichePersonne(personnel);
        System.out.println("Echelon: " + personnel.getEchelon());
        System.out.println("Point d'indice: " + personnel.getPointDIndice());
    }
}
