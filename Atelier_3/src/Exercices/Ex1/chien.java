package Exercices.Ex1;

public class chien {
    String nom;

    public void aboyer(){
        System.out.print(nom+" "+"dit wwaaaarf.");
    }
    public void manger(){
        System.out.print("Je mange de la viande\n");
    }
    public static void main(String[] args) {

      chien Rex = new chien();
        chien Max = new chien();
        Rex.nom = "Rex";
       Max.nom = "Max";
        Rex.aboyer();
        Rex.manger();
        Max.aboyer();
        Max.manger();

    }
}
