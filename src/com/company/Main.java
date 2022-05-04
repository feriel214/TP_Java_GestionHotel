package com.company;

public class Main {

    public static void main(String[] args) {

        Hotel laico=new Hotel("Laico");
        laico.Intialiser();

        //creation du clients
        Touriste client1=new Touriste("Lambert","Cristophe","FRZX56777886060",4,"France");
        Privillegie client2=new Privillegie("Ben Foulen","Foulen","09685754",4,"ZX");
        Touriste client3=new Touriste("Victoria","Secret","AZEVC072536960",3,"London");
        Privillegie client4=new Privillegie("Abidi","kawther","12345678",5,"VERMEG");

        //Tester fonctionnalites de l'application en Allocation et liberation  des chambres
        laico.Louer(true,client1);
        laico.Afficher();
        laico.Liberer(0);
        laico.Louer(true,client2);
        laico.Louer(false,client3);
        laico.Louer(false,client4);
        laico.Afficher();

        //Chercher Chambre vide
        System.out.println("Les chambres cherchées sont : \n");
        System.out.println(laico.Chercher(true)); //chambre normale
        System.out.println(laico.Chercher(false)); //chambre normale


        //Afficher Hotel informations
        System.out.println("\n ***************** Les informations de l'hotel *********************");
        System.out.println(laico.toString());

    }
}
