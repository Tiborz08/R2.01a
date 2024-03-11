package jeu;

public abstract class Couleur {
    private String couleur;

    public Couleur() {
        setNeutre();
    }

    public Couleur(String couleur) {
        setCouleur(couleur);
    }

    public String getCouleur() {
        return couleur;
    }

    public void setBleu() {
        this.couleur = "bleu";
    }

    public void setRouge() {
        this.couleur = "rouge";
    }

    public void setNeutre() {
        this.couleur = "neutre";
    }

    public void setCouleur(String couleur) {
        if (couleur.equals("bleu") || couleur.equals("rouge") || couleur.equals("neutre")) {
            this.couleur = couleur;
        } else {
            throw new IllegalArgumentException("La couleur doit être bleu, rouge ou neutre");
        }
    }

}
