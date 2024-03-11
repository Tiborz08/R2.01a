package tp2.universite;

import tp1.universite.EtudiantUtilitaire;
/**
 * Classe Personne (classe abstraite)
 */
public abstract class Personne {
    private String login;
    private String nom;
    private String prenom;
    private String adresse;

    public Personne (String login, String prenom, String nom) {
        setNom(nom);
        setPrenom(prenom);
        setLogin(login);
        this.adresse = null;
    }

    public Personne (String login, String prenom, String nom, String adresse) {
        setNom(nom);
        setPrenom(prenom);
        setLogin(login);
        setAdresse(adresse);
    }

    public String getLogin() {
        return login;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNomComplet() {
        return prenom + " " + nom;
    }

    public String getMail() {
        return getPrenom() + "." + getNom() +  "@univ-grenoble-alpes.fr";
    }

    public boolean existAdresse() {
        return adresse != null && !adresse.isEmpty();
    }

    public String getAdressePersonne() {
        if (existAdresse()) {
            return adresse;
        } else {
            return "aucune";
        }
    }

    /**
     * Modifier le nom de l'étudiant
     *
     * @param nom Le nouveau nom de l'étudiant (avec la première lettre en majuscule)
     */
    public void setNom(String nom) {
        if (nom.contains("-")) {
            String[] noms = nom.split("-");
            nom = "";
            for (String n : noms) {
                nom += EtudiantUtilitaire.capitalize(n) + "-";
            }
            nom = nom.substring(0, nom.length() - 1);
            this.nom = nom;
        } else {
            this.nom = EtudiantUtilitaire.capitalize(nom);
        }
    }

    /**
     * Modifier le prénom de l'étudiant
     *
     * @param prenom Le nouveau prénom de l'étudiant (avec la première lettre en majuscule)
     */
    public void setPrenom(String prenom) {
        if (prenom.contains("-")) {
            String[] prenoms = prenom.split("-");
            prenom = "";
            for (String p : prenoms) {
                prenom += EtudiantUtilitaire.capitalize(p) + "-";
            }
            prenom = prenom.substring(0, prenom.length() - 1);
            this.prenom = prenom;
        } else {
            this.prenom = EtudiantUtilitaire.capitalize(prenom);
        }
    }

    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


}
