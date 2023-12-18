package Exercises;

import java.util.Random;

         /* 29 Feladat (Órai) (saját megoldás)
         Írjunk programot, ami véletlenszerűen kiválaszt egy szülőt
         és a szülőkhöz tartozó előre definiált programokból egy
         lehetséges programot. Pl. Anyával: Sütés,Játszózás, Apával:
         Barkácsolás, Fűnyírás, lehetséges output: Anya - Sütés */

public class F29_AnyaApa_Rng_SwitchC {
    public static void main(String[] args) {

        Random rng = new Random();
        int randomParent = rng.nextInt(2);

        String parentCh = "";
        switch (randomParent) {
            case 0:
                parentCh = "MOTHER";
                break;
            case 1:
                parentCh = "FATHER";
                break;
        }

        System.out.println();
        System.out.println("A mai program:");

        int randomProgram = rng.nextInt(4);

        if (parentCh.equals("MOTHER")) {
            switch (randomProgram) {
                case 0:
                    System.out.println("Anyával: sütés");
                    break;
                case 1:
                    System.out.println("Anyával: játszózás");
                    break;
                case 2:
                    System.out.println("Anyával: festés");
                    break;
                case 3:
                    System.out.println("Anyával - Rajzolás");
                    break;
            }

        } else {
            switch (randomProgram) {
                case 0:
                    System.out.println("Apával: barkácsolás");
                    break;
                case 1:
                    System.out.println("Apával: fűnyírás");
                    break;
                case 2:
                    System.out.println("Apával: focizás");
                    break;
                case 3:
                    System.out.println("Apával - Horgászás");
                    break;
            }

        }parentCh = "kutya";
        System.out.println(parentCh);
    }
}
