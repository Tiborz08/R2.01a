package tp5.tabledoperation;

import java.util.logging.Logger;
import java.util.logging.Level;

public class TableDOperation {
    private Operation[] operations;
    private OperationEnum typeOperation;
    private boolean modeSansErreur;

    private static final int NB_OPERATIONS = 5;
    private static Logger LOGGER = Logger.getLogger(TableDOperation.class.getName());
    public TableDOperation(OperationEnum typeOperation, boolean modeSansErreur) {
        this.typeOperation = typeOperation;
        this.operations = new Operation[NB_OPERATIONS];
        this.modeSansErreur = modeSansErreur;
        initialisation();
    }

    private void initialisation() {
        for (int i = 0; i < NB_OPERATIONS; i++) {
            operations[i] = typeOperation.getOperation(OperationUtilitaire.randomDouble(), OperationUtilitaire.randomDouble(), modeSansErreur);
        }
        LOGGER.log(Level.INFO, "Initialisation des opérations");
    }

    public int getNbOperations() {
        return operations.length;
    }

    public Operation getOperation(int index) {
        return operations[index];
    }

    public int getNbReponsesJustes() {
        int nbReponsesJustes = 0;
        for (Operation operation : operations) {
            if (operation.isReponseJuste()) {
                nbReponsesJustes++;
                LOGGER.log(Level.INFO, "Une réponse juste de l'utilisateur");
            } else {
                LOGGER.log(Level.WARNING, "Une réponse fausse de l'utilisateur");
            }
        }
        return nbReponsesJustes;
    }
}
