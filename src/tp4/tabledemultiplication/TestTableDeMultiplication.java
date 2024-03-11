package tp4.tabledemultiplication;

import java.util.Scanner;
public class TestTableDeMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner un nombre pour la table de multiplication entre 1 et 10 : ");
        int nombreTable;
        do {

            nombreTable = scanner.nextInt();
            scanner.nextLine();
            if (nombreTable < 1 || nombreTable > 10) {
                System.out.println("Merci de répondre entre 1 et 10 ? ");
            }
        } while (nombreTable < 1 || nombreTable > 10);


        System.out.println("Entrainement 1 ou Exercice 2 : ");
        int choix;
        do {
            choix = scanner.nextInt();
            scanner.nextLine();
            if (choix != 1 && choix != 2) {
                System.out.println("Merci de répondre 1 ou 2 ? ");
            }
        } while (choix != 1 && choix != 2);
        boolean estMelange;
        if (choix == 1) {
            estMelange = false;
        } else {
            estMelange = true;
        }

        TableDeMultiplication table = new TableDeMultiplication(nombreTable, estMelange);
        for (int i = 0; i < table.getNombreDeMultiplications(); i++) {
            System.out.println(table.getMultiplication(i));
            table.getMultiplication(i).setReponseUtilisateur(scanner.nextInt());
        }
        System.out.println("Nombre de réponses justes : " + table.getNombreReponsesJustes());
    }
}
