package jeu;
public class ChefElfe extends Elfe {
    private int force;
    public ChefElfe() {
        super();
        setForce(super.getForce() * 2);
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = super.getForce();
    }
}
