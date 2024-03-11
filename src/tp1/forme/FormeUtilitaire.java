package tp1.forme;

public class FormeUtilitaire {
    public static void affichePoint(Point point) {

        System.out.println("x: " + point.getX() + ", y: " + point.getY());
    }

    public static void afficheCercle(Cercle cercle) {
        System.out.println("Centre: ");
        affichePoint(cercle.getCentre());
        System.out.println("Rayon: " + cercle.getRayon());
        System.out.println("Périmètre: " + cercle.getPerimetre());
        System.out.println("Aire: " + cercle.getAire());
    }

    public static void afficheRectangle(Rectangle rectangle) {
        System.out.println("Origine: ");
        affichePoint(rectangle.getOrigine());
        System.out.println("Longueur: " + rectangle.getLongueur());
        System.out.println("Largeur: " + rectangle.getLargeur());
        System.out.println("Périmètre: " + rectangle.getPerimetre());
        System.out.println("Aire: " + rectangle.getAire());
    }
}
