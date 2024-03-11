package tp1;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une chaine de caractères : ");
        String maChaine = scanner.nextLine();
        System.out.println("La chaine de caractères est : " + maChaine);
        System.out.println("La longueur de la chaine de caractères est : " + maChaine.length());
        System.out.println("La chaine de caractères en majuscule est : " + maChaine.toUpperCase());

        System.out.println("Entrez une seconde chaine de caractères : ");
        String maChaine2 = scanner.nextLine();
        if (maChaine.equalsIgnoreCase(maChaine2)) {
            System.out.println("Les deux chaînes sont identiques");
        } else {
            System.out.println("Les deux chaînes ne sont pas identiques");
        }

        if (maChaine.equals(maChaine.toLowerCase())) {
            System.out.println("La chaine est en minuscule");
        } else {
            System.out.println("La chaine n'est pas en minuscule");
        }

        System.out.println(" maChaine entièrement en majuscules à laquelle on aura enlevé les éventuels\n" +
                "blancs au début et à la fin : " + maChaine.trim().toUpperCase());

        StringBuilder stringBuilder = new StringBuilder(maChaine);
        if (maChaine.equals(stringBuilder.reverse().toString())) {
            System.out.println("La chaine est un palindrome");
        } else {
            System.out.println("La chaine n'est pas un palindrome");
        }
    }
}
