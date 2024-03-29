package tp6;

public class PrixException extends Exception {
    public PrixException(String message) {
        super(message);
    }

    public PrixException() {
        super("Le prix de l'article doit être positif.");
    }

}
