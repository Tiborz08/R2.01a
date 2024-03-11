package jeu;
public class Elfe extends Guerrier {
    private int force;
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
}
