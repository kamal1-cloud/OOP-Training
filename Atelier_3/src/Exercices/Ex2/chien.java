package Exercices.Ex2;

import javax.swing.*;
import java.io.File;
import javax.sound.sampled.*;
public class chien {
    String nom;
    public void aboyer(String sens){
        System.out.print(sens);
    }
    public void manger(String qlqc){
        System.out.println(qlqc+"\n");
    }


    public static void main(String[] args) {
        chien Rex = new chien();
        chien Max = new chien();
        Rex.aboyer("[ Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! ");
        Rex.manger("- Je mange de la viande ]");

        Max.aboyer("[ Je ne suis pas du tout en colère. Iwiw !! awaw !! ");
        Max.manger("- Je mange du poisson ]");

    }
}
