package tp5.tabledoperation;

public enum OperationEnum {
    ADDITION, SOUSTRACTION, MULTIPLICATION;

    public Operation getOperation(double terme1, double terme2) {
        switch(this) {
            case ADDITION:
                return new Addition(terme1, terme2);
            case SOUSTRACTION:
                return new Soustraction(terme1, terme2);
            case MULTIPLICATION:
                return new Multiplication(terme1, terme2);
            default:
                return null;
        }
    }
}
