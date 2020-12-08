package Exercices.Ex3;

public class Donner {
    String nom;
    String adresse;
    double solde;
    public Donner(String n,String a, double s){
        nom = n;
        adresse = a;
        solde = s;
    }
    public static void main(String[] args) {
        Donner client1 = new Donner("El Alami Hassan ","Safi",14765.8 );
        Donner client2 = new Donner("Karimi Khalid ","Casablanca",7654.0 );
        System.out.println(client1.nom+" "+"habite à"+"("+client1.adresse+")"+" "+"- infos solde "+client1.solde+" "+"DH");
        System.out.println(client2.nom+" "+"habite à"+"("+client2.adresse+")"+" "+"- infos solde "+client2.solde+" "+"DH");
    }
}
