package jeu;
public class ChefNain extends Nain {
    public ChefNain() {
        super();
    }

    public void subirDegats(int degats) {
        super.subirDegats(degats / 2);
    }

}
