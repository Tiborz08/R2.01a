package tp2.telephone;

import java.util.ArrayList;

public class Telephone {
    private String libelle;
    private Processeur processeur;
    private Ecran ecran;
    private ArrayList<Memoire> RAM = new ArrayList<Memoire>();
    private Memoire Stockage;


    public Telephone(String libelle, Processeur processeur, Memoire Stockage, Ecran ecran) {
        this.libelle = libelle;
        this.processeur = processeur;
        this.ecran = ecran;
        this.Stockage = Stockage;
    }

    public void addRam(Memoire ram) {
        this.RAM.add(ram);
    }

    public int getNombreGigaRam() {
        int total = 0;
        for (Memoire ram : RAM) {
            total += ram.getNombreGiga();
        }
        return total;
    }

    public String getTypeRam() {
        String type = "";
        for (Memoire ram : RAM) {
            type += ram.getType() + " " + ram.getNombreGiga() + "G +";
        }
        System.out.println(type);
        type = type.substring(0, type.length() - 1);
        return type;
    }

    @Override
    public String toString() {
        return libelle + ", processeur = " + processeur.getLibelle() + " (" + processeur.getFrequence() + "GHz), ram = " + getNombreGigaRam() + "Go [" + getTypeRam() + "], \n" +
                " stockage = [" + Stockage.getType() + ", "+ Stockage.getNombreGiga() + "Go], ecran = [" + ecran.getType()+ ", " + ecran.getTaille() + " pouces]";
    }
}
