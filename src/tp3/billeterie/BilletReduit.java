package tp3.billeterie;

public class BilletReduit extends Billet {
    private double tauxDeReduction;
    private static final double MIN_TAUX = 0.05;
    private static final double MAX_TAUX = 0.5;
    private Trajet trajet;
    public BilletReduit(Trajet trajet, double prixAuKm, double tauxDeReduction) {
        super(trajet, prixAuKm);
        setTauxDeReduction(tauxDeReduction);
    }

    public double getTauxDeReduction() {
        return tauxDeReduction;
    }

    public double getPrix() {
        return super.getPrixAuKm() * (1 - tauxDeReduction);
    }

    public void setTauxDeReduction(double tauxDeReduction) {
        if (tauxDeReduction < MIN_TAUX || tauxDeReduction > MAX_TAUX) {
            if (tauxDeReduction < MIN_TAUX) {
                tauxDeReduction = MIN_TAUX;
            } else {
                tauxDeReduction = MAX_TAUX;
            }
        }
        this.tauxDeReduction = tauxDeReduction;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
