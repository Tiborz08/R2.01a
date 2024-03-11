package tp4.tabledemultiplication;

public class TableDeMultiplication {
    private int nombreTable;
    private Multiplication[] multiplications;
    private static final int NOMBRE_DE_MULTIPLICATIONS = 10;
    public TableDeMultiplication(int nombreTable, boolean estMelange) {
        this.nombreTable = nombreTable;
        if (estMelange) {
            multiplications = new Multiplication[NOMBRE_DE_MULTIPLICATIONS];
            initialisation();
            melange();
        } else {
            multiplications = new Multiplication[NOMBRE_DE_MULTIPLICATIONS];
            initialisation();
        }
    }

    public int getNombreReponsesJustes() {
        int nombreReponsesJustes = 0;
        for (int i = 0; i < multiplications.length; i++) {
            if (multiplications[i].isReponseJuste()) {
                nombreReponsesJustes++;
            }
        }
        return nombreReponsesJustes;
    }
    public int getNombreDeMultiplications() {
        return multiplications.length;
    }

    public Multiplication getMultiplication(int i) {
        return multiplications[i];
    }

    private void initialisation() {
        for (int i = 0; i < NOMBRE_DE_MULTIPLICATIONS; i++) {
            multiplications[i] = new Multiplication(nombreTable, i);
        }
    }

    private void melange() {
        for (int i = 0; i < NOMBRE_DE_MULTIPLICATIONS; i++) {
            int j = (int) (Math.random() * NOMBRE_DE_MULTIPLICATIONS);
            Multiplication temp = multiplications[i];
            multiplications[i] = multiplications[j];
            multiplications[j] = temp;
        }
    }
}
