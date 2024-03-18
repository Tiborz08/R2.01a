package jeu;
public class Elfe extends Guerrier {
    private int force;
    private static final int COUT_ELFE = 2;
    public Elfe() {
        super();
        setForce(super.getForce() * 2);
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        super.setForce(force);
    }

    @Override
    public int getCout() {
        return COUT_ELFE;
    }
}
