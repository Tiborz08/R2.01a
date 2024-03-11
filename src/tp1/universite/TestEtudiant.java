package tp1.universite;

/**
 * La classe TestEtudiant permet de tester la classe Etudiant
 */
public class TestEtudiant {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("DUPONTP", "pierre", "DUPONT");
        Etudiant etudiant2 = new Etudiant("martinf", "francis", "martin");
        // Ajouter une adresse
        etudiant2.setAdresse("2 Place Doyen Gosse");
        etudiant2.addNote(8.5);
        etudiant2.addNote(10.5);
        etudiant2.addNote(11.5);
        etudiant1.setGroupe(new Groupe("A"));

        System.out.println("--------------------");
        System.out.println(etudiant1);
        System.out.println("--------------------");
        System.out.println(etudiant2);

        // etudiant1.login = "LOGIN_QUI_NE_RESPECTE_PAS_LA_CONTRAINTE";
    }
}
