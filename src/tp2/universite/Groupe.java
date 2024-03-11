package tp2.universite;

import java.util.Collection;
import java.util.TreeSet;

public class Groupe {
    private String libelle;
    private TreeSet<Etudiant> etudiants;
    public Groupe(String libelle) {
        this.libelle = libelle;
        this.etudiants = new TreeSet<>();
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void addEtudiant(Etudiant etudiant) {
        if (!containsEtudiant(etudiant)) {
            etudiants.add(etudiant);
            etudiant.setGroupe(this);
        }

    }

    public void removeEtudiant(Etudiant etudiant) {
        if (containsEtudiant(etudiant)) {
            etudiants.remove(etudiant);
        }
    }

    public boolean containsEtudiant(Etudiant etudiant) {
        return etudiants.contains(etudiant);
    }

    public Collection<Etudiant> getEtudiants() {
        return etudiants;
    }
}
