package tp3.billeterie;

public class Trajet {
    private String depart;
    private String arrivee;
    private int distance;
    private static final int MIN_DISTANCE = 5;
    private static final int MAX_DISTANCE = 2000;

    public Trajet(String depart, String arrivee, int distance) {
        setArrivee(arrivee);
        setDepart(depart);
        setDistance(distance);
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        if (distance < MIN_DISTANCE || distance > MAX_DISTANCE) {
            if (distance < MIN_DISTANCE) {
                distance = MIN_DISTANCE;
            } else {
                distance = MAX_DISTANCE;
            }
        }
        this.distance = distance;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
