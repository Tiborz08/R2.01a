package jeu;

public abstract class Guerrier {
    private int force;
    private int pointsDeVie;
    private static final int FORCE_BASE = 10;
    private static final int PV_MAX_BASE = 100;
    private static final int RESSOURCE_BASE = 1;
    private Chateau chateau;


    public Guerrier() {
        setForce(FORCE_BASE);
        setPointsDeVie(PV_MAX_BASE);
        this.chateau = null;
    }


    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public boolean estVivant() {
        return pointsDeVie > 0;
    }

    public void attaquer(Guerrier guerrier) {
        guerrier.subirDegats(this.getForce());
    }

    public void subirDegats(int degats) {
        this.setPointsDeVie(this.getPointsDeVie() - degats);
    }

    public int getRessourcesPourEntrainement() {
        return RESSOURCE_BASE;
    }

    public Couleur getCouleur() {
        return Couleur.NEUTRE;
    }

    public void setChateau(Chateau chateau) {
        this.chateau = chateau;
    }

    public boolean estBleu() {
        return couleur == Couleur.BLEU;
    }

    public boolean estRouge() {
        return couleur == Couleur.ROUGE;
    }

    @Override
    public String toString() {
        return "[force=" + force + ", pointsDeVie=" + pointsDeVie + "]";
    }
}
