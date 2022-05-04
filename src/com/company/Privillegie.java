package com.company;

public class Privillegie extends Client {
    //Attributs
    private String societe;


    //Constructeur
    public Privillegie(String nom, String prenom, String cin_pass, int nbnuits, String societe) {
        super(nom, prenom, cin_pass, nbnuits);
        this.societe = societe;
    }

    //Getters & setters

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    //Afficher Method

    @Override
    public String toString() {
        return "Privillegie{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin_pass='" + cin_pass + '\'' +
                ", nbnuits=" + nbnuits +
                ", societe='" + societe + '\'' +
                '}';
    }
}
