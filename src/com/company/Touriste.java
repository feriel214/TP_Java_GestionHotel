package com.company;

public class Touriste extends Client{

    //Attributs
    private String pays;

    //Constructeur
    public Touriste(String nom, String prenom, String cin_pass, int nbnuits, String pays) {
        super(nom, prenom, cin_pass, nbnuits);
        this.pays = pays;
    }

    //Getters & setters
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    //Afficher Method
    @Override
    public String toString() {
        return "Touriste{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin_pass='" + cin_pass + '\'' +
                ", nbnuits=" + nbnuits +
                ", pays='" + pays + '\'' +
                '}';
    }
}
