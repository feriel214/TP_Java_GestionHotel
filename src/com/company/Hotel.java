package com.company;

import java.util.Arrays;

public class Hotel {

    final int max_chambre=20;
    private String nom;
    private Chambre[] tab_chambres=new Chambre[max_chambre];
    private double gaintotal;
    //Constructeur
        public Hotel(String nom) {
        this.nom = nom;
        }

    //getters & setters
    public int getMax_chambre() {
        return max_chambre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Chambre[] getTab_chambres() {
        return tab_chambres;
    }


    public double getGaintotal() {
        return gaintotal;
    }





    //Louer Method
    public void Louer(boolean type , Client c){
        int numChambreLibre=Chercher(type);
        if(numChambreLibre != -1){
            this.tab_chambres[numChambreLibre].setCli(c);
        }



    }
    //Liberer Method
    public void Liberer(int numch){
        this.tab_chambres[numch].setCli(null);
    }
    //chercher Method
    int Chercher(boolean type){
      int i=0;
      boolean test=false;
      while (i<20 && !test){
          if(this.tab_chambres[i].getCli()==null){
              if(this.tab_chambres[i].isType()==type){
                  test=true;
              }
          }
          i++;
      }

      return test ? i-1 : -1;



    }


    // Intialiser Method
    public void Intialiser(){
        for (int i = 0; i < 15; i++) {
            this.tab_chambres[i] =new Chambre(i,true,50,null);
        }
        for (int i = 15; i < 20; i++) {
            this.tab_chambres[i] =new Chambre(i,false,90,null);
        }
    }

    //Facture
    double Facture(int numch){
        Chambre ch=this.tab_chambres[numch];
        return ch.Facture();
    }

    //Affichage
    public void Afficher(){


            System.out.println(" BILAN DE L'HOTEL");
            for(int i=0;i<tab_chambres.length;i++){

            System.out.println(" **********************************************");
            System.out.println("\nChambre numéro : "+tab_chambres[i].getNum());
            if(tab_chambres[i].isType()){
                System.out.println("type : normale ");
            }else {
                System.out.println("type : luxe ");
            }
            System.out.println("prix : "+tab_chambres[i].getPrix()+"DT");
            if(tab_chambres[i].getCli() != null){
                this.gaintotal+=tab_chambres[i].Facture();
                System.out.println("Louée par :  \n");
                System.out.println("       nom :  "+((Client) tab_chambres[i].getCli()).getNom());
                System.out.println("       prénom :  "+((Client)tab_chambres[i].getCli()).getPrenom());
                System.out.println("       CIN-NP :  "+((Client)tab_chambres[i].getCli()).getCin_pass());
                System.out.println("       nombre de nuits :  "+((Client)tab_chambres[i].getCli()).getNbnuits());
            if(tab_chambres[i].getCli() instanceof Touriste){
                System.out.println("       pays :  "+((Touriste) tab_chambres[i].getCli()).getPays());

            }else  if(tab_chambres[i].getCli() instanceof Privillegie) {
                System.out.println("       société :  "+((Privillegie) tab_chambres[i].getCli()).getSociete());
            }

                System.out.println("       facture :  "+Facture(i)+"DT");
            }else{
                System.out.println("Louée par :  Libre");
            }

            }
            System.out.println(" **********************************************");
            System.out.println("                         Gain total : "+this.gaintotal+"DT");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "max_chambre=" + max_chambre +
                ", nom='" + nom + '\'' +
                ", tab_chambres=" + Arrays.toString(tab_chambres) +
                ", gaintotal=" + gaintotal +
                '}';
    }
}
