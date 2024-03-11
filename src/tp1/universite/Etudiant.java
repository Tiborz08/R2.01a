package tp1.universite;

import static java.lang.Math.round;

/**
 * La classe Etudiant représente la notion d'étudiant (login, nom, prénom
 et adresse).
 * ATTENTION des contraintes sur la notion d’étudiant :
 * – un étudiant doit toujours avoir un login en minuscule
 * – un étudiant doit toujours avoir un nom et un prénom avec
 * le premier caractère en majuscule et les autres en minuscule.
 */
public class Etudiant {
    private String login;
    private String nom;
    private String prenom;
    private String adresse;
    private double[] notes;
    private int NB_NOTES;
    private Groupe groupe;

    public Etudiant(String login, String nom, String prenom) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
        setAdresse(null);
        setGroupe(null);
        this.NB_NOTES = 0;
        this.notes = new double[5];
    }

    public void setLogin(String login) {
        this.login = login.toLowerCase();
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
        if (existAdresse()) {
            return adresse;
        } else {
            return "aucune";
        }
    }

    /**
     * Récupérer le nom complet de l'étudiant
     *
     * @return Le nom complet de l'étudiant
     */
    public String getNomComplet() {
        return nom + " " + prenom;
    }

    /**
     * Récupérer le mail de l'étudiant
     *
     * @return Le mail de l'étudiant
     */
    public String getMail() {
        return getNom() + "." + getPrenom() +  "@etu.univ-grenoble-alpes.fr";
    }

    /**
     * Vérifier l'existence d'un adresse pour l'étudiant
     *
     * @return Vrai si l'étudiant à une adresse, Faux sinon
     */
    public boolean existAdresse() {
        return adresse != null;
    }

    public boolean existGroupe() {
        return groupe != null;
    }

    public Groupe getGroupe() {
        if (existGroupe()) {
            return groupe;
        } else {
            return null;
        }
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Modifier le nom de l'étudiant
     *
     * @param nom Le nouveau nom de l'étudiant (avec la première lettre en majuscule)
     */
    public void setNom(String nom) {
        this.nom = EtudiantUtilitaire.capitalize(nom);
    }

    /**
     * Modifier le prénom de l'étudiant
     *
     * @param prenom Le nouveau prénom de l'étudiant (avec la première lettre en majuscule)
     */
    public void setPrenom(String prenom) {
        this.prenom = EtudiantUtilitaire.capitalize(prenom);
    }

    public void addNote (double note) {
        if (NB_NOTES == 5) {
            System.out.println("Impossible d'ajouter une note, l'étudiant a déjà 5 notes");
        } else {
            notes[NB_NOTES] = note;
            NB_NOTES++;
        }
    }

    public double getMoyenne() {
        if (NB_NOTES == 0) {
            return 0;
        } else {
            double somme = 0;
            int i = 0;
            while (i < NB_NOTES && notes[i] != 0) {
                somme += notes[i];
                i++;
            }

            return round(somme / i);
        }

    }

    public String getNotes() {
        String res = "";
        for (int i = 0; i < NB_NOTES; i++) {
            res += notes[i] + " ";
        }
        if (NB_NOTES == 0) {
            return "";
        } else {
            return NB_NOTES + " notes : " + res;
        }
    }

    @Override
    public String toString() {
        String messageGroupe;
        String messageMoyenne;
        if (getMoyenne()==0) {
            messageMoyenne = "Moyenne : aucune note";
        } else {
            messageMoyenne = "Moyenne : " + getMoyenne();
        }
        if (getGroupe()==null) {
            messageGroupe = "Groupe : aucun";
        } else {
            messageGroupe = "Groupe : " + getGroupe().getLibelle();
        }
        return "Login : " + getLogin() + '\n' +
                "Nom complet : " + getNomComplet() + '\n' +
                "Mail : " + getMail() + '\n' +
                messageGroupe + '\n' +
                "Adresse : " + getAdresse() + '\n' +
                messageMoyenne + '\n' +
                getNotes();
    }
}
