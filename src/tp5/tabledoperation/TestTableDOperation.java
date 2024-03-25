package tp5.tabledoperation;

import java.util.Scanner;

public class TestTableDOperation {
    public static void main(String[] args) {
//        Trace attendue : les réponses en rouge sont les entrées clavier de l’utilisateur. En gras, la
//        gestion des erreurs de saisies (on redemande à l’utilisateur) :
//        Addition 1 ou Soustraction 2 ou Multiplication 3 ? 4
//        Merci de répondre par 1 ou 2 ou 3 ? 1
//        Donner les réponses aux opérations :
//        2.6 + 9.3 = 11.9
//        7.5 + 18.3 = 25.8
//        0.8 + 5.5 = 6.3
//        10.8 + 8.6 = 19.4
//        9.3 + 10.5 = 19.8
//        Nombre de réponses justes : 5
//        Compléter les différentes classes et méthodes pour obtenir des logs comme ci-après. Un log
//        donne plusieurs indications, la classe et la méthode dont il est issue (<init> signifie
//        constructeur) et bien sûr le niveau de log. On peut remarquer qu’un WARNING est remonté
//        lorsque l’utilisateur a donné une mauvaise réponse (log obtenu dans la méthode
//        getNombreDeReponsesJustes() de la classe TableDOperation). Vous pouvez ajouter
//        d’autres logs pour vous aider.

        int choixOperation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Addition 1 ou Soustraction 2 ou Multiplication 3 ? ");
        do {
            choixOperation = scanner.nextInt();
            scanner.nextLine();
            if (choixOperation < 1 || choixOperation > 3) {
                System.out.println("Merci de répondre par 1 ou 2 ou 3 ? ");
            }
        } while (choixOperation < 1 || choixOperation > 3);
        System.out.println("Donner les réponses aux opérations : ");
        TableDOperation tableDOperation = new TableDOperation(OperationEnum.ADDITION);

        System.out.println("Nombre d'opérations : " + tableDOperation.getNbOperations());
        for (int i = 0; i < tableDOperation.getNbOperations(); i++) {
            System.out.println(tableDOperation.getOperation(i));
        }
        System.out.println("Nombre de réponses justes : " + tableDOperation.getNbReponsesJustes());
    }
}
