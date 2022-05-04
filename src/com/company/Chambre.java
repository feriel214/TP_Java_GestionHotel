package com.company;

public class Chambre {
    //Attributs
    private int num;
    private boolean type;
    private double prix;
    private Object cli;


    //Constructeur
    public Chambre(int num, boolean type, double prix, Object cli) {
        this.num = num;
        this.type = type;
        this.prix = prix;
        this.cli = cli;
    }

    //Getters & setters
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Object getCli() {
        if(cli instanceof Touriste){
            return (Touriste) cli;
        }else {
            return (Privillegie) cli;
        }

    }

    public void setCli(Object cli) {
      if(cli ==null){
          this.cli=null;
      }
      else if(cli instanceof Touriste){
          Touriste touriste=new Touriste(((Touriste) cli).getNom(),((Touriste) cli).prenom,((Touriste) cli).getCin_pass(),((Touriste) cli).getNbnuits(),((Touriste) cli).getPays());
          this.cli=touriste;

      }else if(cli instanceof Privillegie){
          Privillegie priv=new Privillegie(((Privillegie) cli).getNom(), ((Privillegie) cli).getPrenom(), ((Privillegie) cli).getCin_pass(),((Privillegie) cli).getNbnuits(),((Privillegie) cli).getSociete());
          this.cli=priv;
      }


    }

    //Afficher Method
    @Override
    public String toString() {
        return "Chambre{" +
                "num=" + num +
                ", type=" + type +
                ", prix=" + prix +
                ", cli=" + cli +
                '}';
    }

    //Facture
    double Facture(){
            double fact = 0;

            if (this.cli instanceof Touriste) {
                //prix pour le touriste
                fact=((Touriste) cli).getNbnuits()*this.prix;
            } else if(this.cli instanceof Privillegie){
                //prix pour un cliennt normale apres réduction de 20%
                fact=(((Privillegie) cli).getNbnuits()*this.prix)-((((Privillegie)  cli).getNbnuits()*this.prix)*20)/100;
            }
            return fact;
    }
}
