package tp3.billeterie;

public class Billet {
    private double prixAuKm;
    private static final double MIN_PRIX = 0.1;
    private static final double MAX_PRIX = 2;
    private Trajet trajet;

    public Billet(Trajet trajet, double prixAuKm) {
        this.trajet = trajet;
        this.prixAuKm = prixAuKm;
    }

    public double getPrixAuKm() {
        return prixAuKm;
    }

    public void setPrixAuKm(double prixAuKm) {
        if (prixAuKm < MIN_PRIX || prixAuKm > MAX_PRIX) {
            if (prixAuKm < MIN_PRIX) {
                prixAuKm = MIN_PRIX;
            } else {
                prixAuKm = MAX_PRIX;
            }
        }
        this.prixAuKm = prixAuKm;
    }
}
