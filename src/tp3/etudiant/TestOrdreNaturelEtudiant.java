package tp3.etudiant;

import tp2.universite.Etudiant;

import java.util.ArrayList;

import java.util.TreeSet;

public class TestOrdreNaturelEtudiant {

    public static void main(String[] args) {
        // Créer les étudiants
        Etudiant etudiant1 = new Etudiant("zerus", "Simon", "Zeru");
        Etudiant etudiant2 = new Etudiant("reyt", "Toni", "Rey");
        // Créer la liste d'étudiants quelconque et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsOrdreQcq = new ArrayList<>();
        mesEtudiantsOrdreQcq.add(etudiant1);
        mesEtudiantsOrdreQcq.add(etudiant2);
        // Afficher la liste d'étudiants quelconque
        EtudiantUtilitaire.affichageEtudiants(mesEtudiantsOrdreQcq);
        // Créer l'ensemble d'étudiants trié et ajouter les étudiants
        TreeSet<Etudiant> mesEtudiantsTries = new TreeSet<>();
        mesEtudiantsTries.add(etudiant1);
        mesEtudiantsTries.add(etudiant2);
        // Afficher l'ensemble d'étudiants trié
        EtudiantUtilitaire.affichageEtudiants(mesEtudiantsTries);
    }

}
