package tp3.etudiant;

import tp2.universite.Etudiant;

import java.util.ArrayList;
import java.util.Collections;

public class TestEtudiantTriMoyenne {
    public static void main(String[] args) {
        // Créer les étudiants
        Etudiant etudiant1 = new Etudiant("zerus", "Simon", "Zeru");
        Etudiant etudiant2 = new Etudiant("reyt", "Toni", "Rey");
        // Ajouter des notes aux étudiants
        etudiant1.addNote (18);
        etudiant1.addNote (14);
        // Créer la liste d'étudiants et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsTries = new ArrayList<>();
        mesEtudiantsTries.add(etudiant1);
        mesEtudiantsTries.add(etudiant2);
        // Afficher la liste des étudiants avant tri
        EtudiantUtilitaire.affichageEtudiants(mesEtudiantsTries);
        // trier la liste
        Collections.sort(mesEtudiantsTries);
        // Afficher la liste des étudiants après tri
        EtudiantUtilitaire.affichageEtudiants(mesEtudiantsTries);
    }
}
