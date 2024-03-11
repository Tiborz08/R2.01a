package jeu;
public class Nain extends Guerrier {
    public Nain() {
        super();
    }

    public void subirDegats(int degats) {
        super.subirDegats(degats / 2);
    }
}
