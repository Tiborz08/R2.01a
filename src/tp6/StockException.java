package tp6;

public class StockException extends Exception {
    public StockException(String message) {
        super(message);
    }

    public StockException() {
        super("Le stock de l'article doit être positif.");
    }
}
