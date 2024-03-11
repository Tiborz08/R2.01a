package tp2.contrainte;

public class ReelContraint {
    private double min;
    private double max;
    private double valeur;

    public ReelContraint(double min, double max) {
        this.min = min;
        this.max = max;
        setValeur(min);
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        if (valeur < min || valeur > max) {
            throw new IllegalArgumentException("La valeur doit être comprise entre " + min + " et " + max);
        }
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "valeur : " + valeur + ", min : " + min + ", max : " + max;
    }
}
