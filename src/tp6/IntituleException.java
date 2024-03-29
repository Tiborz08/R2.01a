package tp6;

public class IntituleException extends Exception {
    public IntituleException(String message) {
        super(message);
    }

    public IntituleException() {
        super("L'intitulé de l'article ne doit pas être vide.");
    }
}
