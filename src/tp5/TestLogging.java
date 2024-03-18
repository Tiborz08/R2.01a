package tp5;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
public class TestLogging {
    // Récupération du logger
    private static Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());
    public static void main(String[] args) {
        LOGGER.log( Level.INFO, "Mon premier log !" );

        int dividende = (int) (Math.random()*9);
        int diviseur = (int) (Math.random()*2);

        try {
            LOGGER.log(Level.WARNING, "Attention à une division par zéro peut se produire");
            int quotient = dividende / diviseur;
            Object[] data = { dividende, diviseur, quotient };
            LOGGER.log( Level.INFO, "dividende = {0}, diviseur = {1} et quotient = {2}", data );
        } catch (ArithmeticException e) {
            LOGGER.log( Level.SEVERE, "Le message d'exception : ", e);
        }
    }

}
