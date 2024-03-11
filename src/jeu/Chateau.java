package jeu;

public class Chateau {
    private static final int RESSOURCES_INITIAL = 3;
    private int ressources;
    private static final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    private Couleur couleur;
    private Guerrier[] guerriersNovices;

    public Chateau(Couleur couleur) {
        this.ressources = RESSOURCES_INITIAL;
        this.couleur = couleur;
        this.guerriersNovices = new Guerrier[0];
    }

    public void ajoutGuerrierNovice(Guerrier guerrier) {

    }

    public Guerrier[] getGuerriersNovices() {
        return guerriersNovices;
    }

    public Guerrier[] entrainer() {
        return null;
    }

    public void incrementerRessources() {
        this.ressources += RESSOURCE_AJOUTEE_PAR_TOUR;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public boolean estBleu() {
        return couleur == ;
    }

    public boolean estRouge() {
        return couleur == Couleur.ROUGE;
    }
}
