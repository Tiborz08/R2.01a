package tp2.universite;

import tp2.contrainte.ReelContraint;

public class Personnel extends Personne{
    private int echelon;
    private ReelContraint pointDIndice = new ReelContraint(SALAIRE_MIN, SALAIRE_MAX);
    public final static double SALAIRE_MIN = 1000;
    public final static double SALAIRE_MAX = 1200;
    public final static int ECHELON_MIN = 1;
    public final static int ECHELON_MAX = 4;

    public Personnel(String login, String prenom, String nom) {
        super(login, prenom, nom);
        setEchelon(ECHELON_MIN);
        setPointDIndice(SALAIRE_MIN);
    }
    public Personnel(String login, String prenom, String nom, int echelon, double pointDIndice) {
        super(login, prenom, nom);
        setEchelon(echelon);
        setPointDIndice(pointDIndice);
    }

    /**
     * Définir l'échelon du personnel
     * échelon entre 1 et 4 (entier)
     * @param echelon
     */
    public void setEchelon(int echelon) {
        if (echelon < ECHELON_MIN || echelon > ECHELON_MAX) {
            if (echelon < ECHELON_MIN) {
                this.echelon = ECHELON_MIN;
            } else {
                this.echelon = ECHELON_MAX;
            }
        }
        this.echelon = echelon;
    }
    /**
     * Définir le point d'indice du personnel
     * pointDIndice entre 1000 et 1200 (double)
     * @param pointDIndice
     */
    public void setPointDIndice(double pointDIndice) {

        try {
            this.pointDIndice.setValeur(pointDIndice);
        } catch (IllegalArgumentException e) {
            if (pointDIndice < SALAIRE_MIN) {
                pointDIndice = SALAIRE_MIN;
            } else {
                pointDIndice = SALAIRE_MAX;
            }
            this.pointDIndice.setValeur(pointDIndice);
        }
        this.pointDIndice.setValeur(pointDIndice);
    }



    public int getEchelon() {
        return echelon;
    }

    public ReelContraint getPointDIndice() {
        return pointDIndice;
    }

    public double calculerSalaire() {
        return echelon * pointDIndice.getValeur();
    }

    public String getMail() {
        return super.getMail();
    }

    public double getSalaire() {
        return calculerSalaire();
    }
}
