package tp2.universite;

import tp2.contrainte.Note;

import java.util.ArrayList;
import java.util.Comparator;

import static java.lang.Math.round;

public class Etudiant extends Personne implements Comparator<Etudiant>, Comparable<Etudiant> {
    private String adresseParent;
    private ArrayList<Note> listeNotes = new ArrayList<Note>();
    private int nbNotes = 0;
    private Groupe groupe;

    public Etudiant (String login, String prenom, String nom) {
        super(login, prenom, nom);
        this.adresseParent = null;
        this.groupe = null;
    }

    public Etudiant (String login, String prenom, String nom, String adresse, String adresseParent) {
        super(login, prenom, nom, adresse);
        setAdresse(adresse, adresseParent);
        this.groupe = null;
    }

    public String getMail() {
        return super.getPrenom() + "." + super.getNom() +  "@etu.univ-grenoble-alpes.fr";
    }
    /**
     * Récupérer l'adresse de l'Etudiant. C’est une redéfinition de la méthode getAdresse() de la classe
     * Personne.
     *
     * @return Retourne une chaîne de caractères correspondant à
     *         l’adresse principale suivi de l’adresse des parents. Si une seule des deux existe, la
     *         méthode ne retourne qu’une adresse soit principale soit celle des parents.
     */
    public String getAdresse() {
        if (existAdresse()) {
            return super.getAdresse() + " " + getAdresseParent();
        } else {
            return getAdresseParent();
        }
    }
    public String getAdresseParent() {
        if (adresseParent == null) {
            return "aucune";
        }
        return this.adresseParent;
    }

    public boolean existAdresse() {
        return super.existAdresse();
    }

    public void setAdresse(String adresse, String adresseParent) {
        super.setAdresse(adresse);
        this.adresseParent = adresseParent;
    }

    public void addNote (double note) {
        if (nbNotes < 5) {
            listeNotes.add(new Note(note));
            nbNotes++;
        } else {
            System.out.println("Impossible d'ajouter une note, le nombre de notes maximum est atteint");
        }
    }

    public double getMoyenne() {
        double somme = 0;
        for (Note note : listeNotes) {
            somme += note.getValeur();
        }
        return round(somme / nbNotes);
    }

    public boolean existGroupe() {
        return this.groupe != null;
    }
    public boolean isContainedGroupe(Groupe groupe) {
        return groupe.containsEtudiant(this);
    }

    public Groupe getGroupe() {
        if (existGroupe()) {
            return this.groupe;
        } else {
            return new Groupe("aucun");
        }
    }
    public void setGroupe(Groupe groupe) {
        if (existGroupe() && !isContainedGroupe(groupe)) {
            this.groupe.removeEtudiant(this);
        }
        this.groupe = groupe;
        if (!groupe.containsEtudiant(this)) {
            groupe.addEtudiant(this);
        }
    }
    @Override
    public int compareTo(Etudiant etudiant) {
        if (getNom().compareTo(etudiant.getNom())==0) {
            return getPrenom().compareTo(etudiant.getPrenom());
        } else {
            return getNom().compareTo(etudiant.getNom());
        }
    }

    @Override
    public int compare(Etudiant etudiant, Etudiant t1) {
        return etudiant.compareTo(t1);
    }

    public int compareNotes(Etudiant etudiant) {
        return Double.compare(getMoyenne(), etudiant.getMoyenne());
    }
}
