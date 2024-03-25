package tp5.tabledoperation;

public class TableDOperation {
    private Operation[] operations;
    private OperationEnum typeOperation;

    private static final int NB_OPERATIONS = 5;

    public TableDOperation(OperationEnum typeOperation) {
        this.typeOperation = typeOperation;
        this.operations = new Operation[NB_OPERATIONS];
    }

    private void initialisation() {
        for (int i = 0; i < NB_OPERATIONS; i++) {
            operations[i] = typeOperation.getOperation(OperationUtilitaire.randomDouble(), OperationUtilitaire.randomDouble());
        }
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
            }
        }
        return nbReponsesJustes;
    }
}
