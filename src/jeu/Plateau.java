package jeu;

public class Plateau {
    private Carreau[] carreaux;

    public Plateau(int longueur) {
        carreaux = new Carreau[longueur];
    }

    public void ajoutGuerriers(Chateau chateau, Guerrier[] guerriers) {
        for (int i = 0; i < guerriers.length; i++) {
            chateau.ajoutGuerrierNovice(guerriers[i]);
        }
    }

    public void deplaceGuerriers() {

    }

    public void lanceCombat() {

    }

    public boolean estPartieTerminee() {
        return carreaux[0].estRouge() || carreaux[carreaux.length - 1].estBleu();
    }

    public Carreau[] getCarreaux() {
        return carreaux;
    }

    public Couleur getGagnant() {
        return carreaux[0].estRouge() ? new Couleur("rouge") : new Couleur("bleu");
    }

    private Carreau getDepartBleu() {
        return carreaux[0];
    }

    private Carreau getDepartRouge() {
        return carreaux[carreaux.length - 1];
    }


}
