package com.company;

public class Client {
    //Attributs
    protected String nom ;
    protected String prenom;
    protected String cin_pass;
    protected int nbnuits;
    protected double reduction;

    //Constructeur
    public Client(String nom, String prenom, String cin_pass, int nbnuits) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin_pass = cin_pass;
        this.nbnuits = nbnuits;
    }


    //Getters & setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin_pass() {
        return cin_pass;
    }

    public void setCin_pass(String cin_pass) {
        this.cin_pass = cin_pass;
    }

    public int getNbnuits() {
        return nbnuits;
    }

    public void setNbnuits(int nbnuits) {
        this.nbnuits = nbnuits;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

    //Afficher Method

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin_pass='" + cin_pass + '\'' +
                ", nbnuits=" + nbnuits +
                '}';
    }
}
