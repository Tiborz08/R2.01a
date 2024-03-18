package jeu;

public class Chateau {
    private static final int RESSOURCES_INITIAL = 3;
    private int ressources;
    private static final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    private Couleur couleur;
    private Guerrier[] guerriersNovices;
    private static final int COUT_BASE = 1;

    private static final int COUT_CHEF_NAIN = 3;
    private static final int COUT_CHEF_ELFE = 4;

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

    }

    private void incrementerRessources() {
        this.ressources += RESSOURCE_AJOUTEE_PAR_TOUR;
    }

    public Couleur getCouleur() {
        return couleur;
    }
}
