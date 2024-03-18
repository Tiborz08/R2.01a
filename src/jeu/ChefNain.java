package jeu;
public class ChefNain extends Nain {
    public ChefNain() {
        super();
    }

    public void subirDegats(int degats) {
        super.subirDegats(degats / 2);
    }

    @Override
    public int getCout() {
        return super.getCout()*3;
    }

}
