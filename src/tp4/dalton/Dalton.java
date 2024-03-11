package tp4.dalton;


import java.util.Comparator;

public class Dalton implements Comparable<Dalton> {
    private String nom;
    private Taille taille;

    public Dalton(String nom, Taille taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public Taille getTaille() {
        return taille;
    }

    @Override
    public int compareTo(Dalton o) {
        int tailleComparison = this.taille.compareTo(o.getTaille());
        if (tailleComparison != 0) {
            return tailleComparison;
        } else {
            return this.nom.compareTo(o.getNom());
        }
    }
    public static final Comparator<Dalton> comparateurNomSolution2 = new Comparator<>() {
        @Override
        public int compare(Dalton d1, Dalton d2) {
            return d1.getNom().compareTo(d2.getNom());
        }
    };
    @Override
    public String toString() {
        return nom + " (" + taille + ")";
    }
}
