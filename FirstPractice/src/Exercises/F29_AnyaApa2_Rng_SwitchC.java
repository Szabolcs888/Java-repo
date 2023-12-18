package Exercises;

import java.util.Random;

         /* 29 Feladat (Órai) (Zsolt megoldása)
         Írjunk programot, ami véletlenszerűen kiválaszt egy szülőt
         és a szülőkhöz tartozó előre definiált programokból egy
         lehetséges programot. Pl. Anyával: Sütés,Játszózás, Apával:
         Barkácsolás, Fűnyírás, lehetséges output: Anya - Sütés */

public class F29_AnyaApa2_Rng_SwitchC {
    public static void main(String[] args) {

        Random random = new Random();
        int randomParent = random.nextInt(2);   // 0:anya, 1:apa
        int programIndex = random.nextInt(4);   // 0,1,2,3

        if(randomParent==0) {
            switch (programIndex){
                case 0:
                    System.out.println("Anya - Sütés");
                    break;
                case 1:
                    System.out.println("Anya - Játszózás");
                    break;
                case 2:
                    System.out.println("Anya - Sétálás");
                    break;
                case 3:
                    System.out.println("Anya - Rajzolás");
                    break;
            }
        }else{
            switch (programIndex){
                case 0:
                    System.out.println("Apa - Barkácsolás");
                    break;
                case 1:
                    System.out.println("Apa - Fűnyírás");
                    break;
                case 2:
                    System.out.println("Apa - Meccs nézés");
                    break;
                case 3:
                    System.out.println("Apa - Horgászás");
                    break;
            }
        }
    }
}
