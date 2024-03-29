package tp6;


import static tp1.universite.EtudiantUtilitaire.capitalize;

public class Article {
    private String intitule;
    private double prix;
    private int stock;
    private static final double REDUCTION = 0.9;
    private static final int SEUIL = 100;

    public Article(String intitule, double prix, int stock) throws IntituleException, PrixException, StockException {

        setIntitule(intitule);
        setPrix(prix);
        setStock(stock);
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) throws IntituleException {
        if (intitule == null || intitule.isEmpty()) {
            throw new IntituleException("L'intitulé ne peut pas être vide.");
        }

        this.intitule = capitalize(intitule);
    }

    public double getPrix() {
        return prix;
    }

    public double getPrix(int quantite) {
        double total = prix * quantite;
        if (quantite >= SEUIL) {
            total *= REDUCTION;
        }
        return total;
    }

    public void setPrix(double prix) throws PrixException {
        if (prix <= 0) {
            throw new PrixException("Le prix doit être positif.");
        }
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws StockException {
        if (stock <=  0) {
            throw new StockException();
        }
        this.stock = stock;
    }

    public boolean existQuantite(int quantite) {
        return stock >= quantite;
    }

    public void removeQuantite(int quantite) throws StockException {
        if (existQuantite(quantite)) {
            stock -= quantite;
        } else {
            throw new StockException();
        }
    }
}
