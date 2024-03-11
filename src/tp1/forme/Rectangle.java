package tp1.forme;

public class Rectangle {
    private Point origine;
    private int longueur;
    private int largeur;

    public Rectangle(int longueur, int largeur) {
        setLargeur(largeur);
        setLongueur(longueur);
        this.origine = new Point();
    }

    public Rectangle(int longueur, int largeur, int valX, int valY) {
        setLargeur(largeur);
        setLongueur(longueur);
        this.origine = new Point(valX, valY);
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public Point getOrigine() {
        return new Point(origine.getX(), origine.getY());
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getPerimetre() {
        return 2 * (longueur + largeur);
    }

    public int getAire() {
        return longueur * largeur;
    }

    public void deplaceOrigine(int dx, int dy) {
        origine.deplacer(dx, dy);
    }
}
