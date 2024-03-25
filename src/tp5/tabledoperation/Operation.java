package tp5.tabledoperation;

import java.util.logging.Logger;
import java.util.logging.Level;

public abstract class Operation {
    private double terme1;
    private double terme2;
    private Double reponseUtilisateur;
    private boolean modeSansErreur;
    private static Logger LOGGER = Logger.getLogger(Operation.class.getName());
    public Operation(double terme1, double terme2, boolean modeSansErreur) {
        this.terme1 = terme1;
        this.terme2 = terme2;
        this.modeSansErreur = modeSansErreur;
        LOGGER.log(Level.INFO, "Création d'opération avec les termes " + terme1 + " et " + terme2);
    }

    public double getTerme1() {
        return terme1;
    }

    public double getTerme2() {
        return terme2;
    }

    public void setReponseUtilisateur(Double reponse) throws ErreurOperationException {
        this.reponseUtilisateur = reponse;
        if ( modeSansErreur && !isReponseJuste() ) {
            throw new ErreurOperationException("La réponse n'est pas correcte, réessayez !");
        }
    }

    public boolean existeReponseUtilisateur() {
        return reponseUtilisateur != null;
    }

    public boolean isReponseJuste() {
        return reponseUtilisateur != null && reponseUtilisateur == calculResultat();
    }

    public abstract double calculResultat();
}
