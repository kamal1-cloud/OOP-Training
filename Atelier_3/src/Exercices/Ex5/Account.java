package Exercices.Ex5;

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
    public static void main(String[] args) {
     Account Client = new Account();
     Client.setNom("Kamal Habrich");
     Client.setAdresse("Marrakech");
     Client.setSolde(20000);
        System.out.println(Client.getNom()+" "+"habite à"+" "+Client.getAdresse()+" "+"-Avec un solde de"+" "+Client.getSolde());
    }
}
