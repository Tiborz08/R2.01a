package jeu;

public class Carreau implements Comparable<Carreau> {
    private Guerrier[] GuerriersBleus;
    private Guerrier[] GuerriersRouges;

    public Carreau() {
        GuerriersBleus = new Guerrier[0];
        GuerriersRouges = new Guerrier[0];
    }

    public Guerrier[] getGuerriersBleus() {
        return GuerriersBleus;
    }

    public Guerrier[] getGuerriersRouges() {
        return GuerriersRouges;
    }

    public void ajoutGuerriersBleus(Guerrier[] guerriers) {
        for (int i = 0; i < guerriers.length; i++) {
            GuerriersBleus[GuerriersBleus.length] = guerriers[i];
        }
    }

    public void ajoutGuerriersRouges(Guerrier[] guerriers) {
        for (int i = 0; i < guerriers.length; i++) {
            GuerriersRouges[GuerriersRouges.length] = guerriers[i];
        }
    }

    public Guerrier[] retirerGuerriersBleus() {
        GuerriersBleus = new Guerrier[0];
        return GuerriersBleus;
    }

    public Guerrier[] retirerGuerriersRouges() {
        GuerriersRouges = new Guerrier[0];
        return GuerriersRouges;
    }

    public void supprimerGuerrier(Guerrier guerrier) {
        for (int i = 0; i < GuerriersBleus.length; i++) {
            if (GuerriersBleus[i] == guerrier) {
                GuerriersBleus[i] = null;
            }
        }
        for (int i = 0; i < GuerriersRouges.length; i++) {
            if (GuerriersRouges[i] == guerrier) {
                GuerriersRouges[i] = null;
            }
        }
    }

    public boolean estRouge() {
        return GuerriersRouges.length > GuerriersBleus.length;
    }

    public boolean estBleu() {
        return GuerriersBleus.length > GuerriersRouges.length;
    }

    public boolean estChampDeBataille() {
        return GuerriersBleus.length == GuerriersRouges.length;
    }

    public void lanceCombat() {
        for (int i = 0; i < GuerriersBleus.length; i++) {
            for (int j = 0; j < GuerriersRouges.length; j++) {
                GuerriersBleus[i].attaquer(GuerriersRouges[j]);
                GuerriersRouges[j].attaquer(GuerriersBleus[i]);
            }
        }
    }

    @Override
    public int compareTo(Carreau o) {
        return 0;
    }
}
