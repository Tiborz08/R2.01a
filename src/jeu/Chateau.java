package jeu;

public class Chateau {
    private static final int RESSOURCES_INITIAL = 3;
    private int ressources;
    private static final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    private Couleur couleur;
    private Guerrier[] guerriersNovices;

    private Plateau plateau;

    public Chateau(Couleur couleur) {
        this.ressources = RESSOURCES_INITIAL;
        this.couleur = couleur;
        this.guerriersNovices = new Guerrier[0];
        this.plateau = new Plateau(10);
    }

    public void ajoutGuerrierNovice(Guerrier guerrier) {
        // tableau ordonné
        guerriersNovices[guerriersNovices.length] = guerrier;
    }

    public Guerrier[] getGuerriersNovices() {
        return guerriersNovices;
    }

    public Guerrier[] entrainer() {
        return guerriersNovices;
    }

    private void incrementerRessources() {
        this.ressources += RESSOURCE_AJOUTEE_PAR_TOUR;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public boolean estBleu() {
        return couleur.estBleu() ;
    }

    public boolean estRouge() {
        return couleur.estRouge();
    }
}
