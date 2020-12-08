package Exercices.Ex6;

import java.util.Arrays;

public class Account {
    private String nom;
    private String adresse;
    private double solde;
    // Getter
    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public Double getSolde() {
        return solde;
    }

    // Setter
    public void setNom(String newName) {
        this.nom = newName;
    }
    public void setAdresse(String newAdress) {
        this.adresse = newAdress;
    }
    public void setSolde(double newSold)  {
        this.solde = newSold;
    }

    public void retirer(double m) {
        if(m > solde){
            System.out.println("Retrait refusé, contactez votre banque ");
        }
        else{
            System.out.println("Le solde retirer :"+" "+m);
            System.out.println("le solde rester"+" "+ (solde - m));
        }
    }

    public static void main(String[] args) {
      Account Client = new Account();
        Client.setNom("Kamal Habrich");
        Client.setAdresse("Marrakech");
        Client.setSolde(20000);
        System.out.println(Client.getNom()+" "+"habite à"+" "+Client.getAdresse()+" "+"\n-Avec un solde de"+" "+Client.getSolde());
        Client.retirer(2000000);
    }
}
