package tp1.forme;

public class Cercle {
    private Point centre;
    private int rayon;

    Cercle(int rayon) {
        setRayon(rayon);
        this.centre = new Point();
    }
    Cercle(int rayon, Point centre) {
        setRayon(rayon);
        this.centre = centre;
    }

    public Point getCentre() {
        return centre;
    }

    public int getRayon() {
        return rayon;
    }


    public void setRayon(int nouveauRayon) {
        this.rayon = nouveauRayon;
    }


    public double getPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double getAire() {
        return Math.PI * rayon * rayon;
    }

    public void deplaceCentre(int dx, int dy) {
        centre.deplacer(dx, dy);
    }
}
