package tp5.tabledoperation;

import tp5.TestLogging;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
public class TestTableDOperation {

    private static Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());

    private static void demandeReponseUtilisateur(Operation operation, Scanner entree) {
        // Affichage de l’opération
        System.out.print(operation);
        // Demander la réponse utilisateur
        double reponseUtilisateur = entree.nextDouble();
        entree.nextLine();
        // Enregistrer la réponse utilisateur
        try {
            operation.setReponseUtilisateur(reponseUtilisateur);
        } catch (ErreurOperationException e) {
            System.out.println(e.getMessage());
            demandeReponseUtilisateur(operation, entree);
        }

    }
    public static void main(String[] args) {

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

        OperationEnum typeOperation;

        if (choixOperation == 1) {
            typeOperation = OperationEnum.ADDITION;
        } else if (choixOperation == 2) {
            typeOperation = OperationEnum.SOUSTRACTION;
        } else {
            typeOperation = OperationEnum.MULTIPLICATION;
        }
        LOGGER.log(Level.INFO, "Type d'opération : " + typeOperation.toString());

        System.out.println("Mode sans erreur true ou false ? ");

        String modeSansErreur;

        do {
            modeSansErreur = scanner.nextLine();
            if (!Objects.equals(modeSansErreur, "true") && !Objects.equals(modeSansErreur, "false")) {
                System.out.println("Merci de répondre par true ou false ? ");
            }
        } while (!Objects.equals(modeSansErreur, "true") && !Objects.equals(modeSansErreur, "false"));

        LOGGER.log(Level.INFO, "Mode sans erreur : " + modeSansErreur);
        boolean boolMode;
        if (Objects.equals(modeSansErreur, "true")) {
            boolMode = true;
        } else {
            boolMode = false;
        }
        System.out.println("Donner les réponses aux opérations : ");

        TableDOperation tableDOperation = new TableDOperation(typeOperation, boolMode);

        System.out.println("Nombre d'opérations : " + tableDOperation.getNbOperations());
        for (int i = 0; i < tableDOperation.getNbOperations(); i++) {
            demandeReponseUtilisateur(tableDOperation.getOperation(i), scanner);
        }
        System.out.println("Nombre de réponses justes : " + tableDOperation.getNbReponsesJustes());
    }
}
