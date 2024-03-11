package tp3.etudiant;

import tp2.universite.Etudiant;

import java.util.Collection;

public class EtudiantUtilitaire {
    static void affichageEtudiants(Collection<Etudiant> etudiants) {
        for(Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getNom() + ", " + etudiant.getPrenom());
        }
    }
}
