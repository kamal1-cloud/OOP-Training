package Exercices.Ex4;
import java.util.Scanner;

public class Account {
    String nom;
    String adresse;
    double solde;
   public void afficherInfosSolde(){
       Scanner info = new Scanner(System.in);  // Create a Scanner object
       System.out.println("Enter le nom, l\'adresse est le salary:");
       nom = info.nextLine();
       adresse = info.nextLine();
       solde = info.nextDouble();
       System.out.println(nom+" "+"habite à"+" "+adresse+" "+"-Avec un solde de"+" "+solde+" "+"DH");
   }

   public double calculerInterer(double tauxInteret){
       System.out.println("Le taux d'intérêt et de :" + tauxInteret);
       System.out.println(" l’intérêt Sur Solde est :"+tauxInteret*solde);
       return 0;
   }

    public static void main(String[] args) {
        Account Clients = new Account();
        Clients.afficherInfosSolde();
        Clients.calculerInterer(0.07);

    }
}
