package tp2.contrainte;

public class TestContrainte {
    public static void main(String[] args) {
        // Test reels contraints
        ReelContraint r1 = ContrainteUtilitaire.saisir(0, 10);

        System.out.println(r1);
        try {
            r1.setValeur(11);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            r1.setValeur(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        ReelContraint r2 = new ReelContraint(0, 10);
        System.out.println(r2);
        r2.setValeur(10);
        System.out.println(r2);
        try {
            r2.setValeur(11);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            r2.setValeur(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        ReelContraint r3 = new ReelContraint(0, 10);
        System.out.println(r3);
        r3.setValeur(0);
        System.out.println(r3);
        try {
            r3.setValeur(11);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            r3.setValeur(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Test notes

        Note n1 = new Note();
        System.out.println(n1);
        n1.setValeur(5);
        System.out.println(n1);
        try {
            Note n2 = new Note(21);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
