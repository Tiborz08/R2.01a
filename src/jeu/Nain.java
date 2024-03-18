package jeu;
public class Nain extends Guerrier {
    public Nain() {
        super();
    }
    public void subirDegats(int degats) {
        super.subirDegats(degats / 2);
    }

    @Override
    public int getCout() {
        return super.getCout();
    }
}
