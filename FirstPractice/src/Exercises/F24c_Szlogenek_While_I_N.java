package Exercises;

import java.util.Scanner;

         /* 24.c Feladat (saját megoldás)

         Készítsetek szlogen automatát, amely a felhasználó által beolvasott
         márkára visszaadja a felhasználónak az adott márka szlogenjét.
         Switch-case adatszerkezettel oldjátok meg. A szlogen visszaadása után
         kérdezzük meg a felhasználót, hogy kíváncsi-e új szlogenre. Yes/No.
         Yes esetén mindig újraindul a program, No esetén szép napot kívánunk neki
         és kilépünk. Az exittel való kilépésre már nincs sükség. */

public class F24c_Szlogenek_While_I_N {
    public static void main(String[] args) {

        Scanner scanSlogen = new Scanner(System.in);
        String brand = "";
        String userCh = "I";

        while (userCh.equals("I")) {
            System.out.println();
            System.out.println("Kérlek, írj be egy cégnevet:");
            brand = scanSlogen.next().toUpperCase();
            while (!(brand.equals("NIKE")) && (!brand.equals("APPLE")) && (!brand.equals("VOLKSWAGEN")) && (!brand.equals("REDBULL"))
                    && (!brand.equals("PEPSI"))) {
                System.out.println();
                System.out.println("Ezt a cégnevet nem ismerem.");

                System.out.println("Kérlek, írj be egy cégnevet:");
                brand = scanSlogen.next().toUpperCase();
            }
            switch (brand) {
                case "NIKE":
                    System.out.println("Just Do It");
                    break;
                case "APPLE":
                    System.out.println("Think different");
                    break;
                case "VOLKSWAGEN":
                    System.out.println("Das auto");
                    break;
                case "REDBULL":
                    System.out.println("A Red Bull szárnyakat ad");
                    break;
                case "PEPSI":
                    System.out.println("Szia, Kata vagyok, van még egy Pepsid?"); // default esetén nincs szükség break utasításra, mert az az utolsó a sorban
                    break;
            }
            do {
                    System.out.println();
                    System.out.println("Szeretnél még új szlogent?");
                    userCh = scanSlogen.next().toUpperCase();
                    if ((userCh.equals("N"))) {
                        brand = ("EXIT");
                    } else if (!userCh.equals("I")) {
                        System.out.println("Kérlek igennel, vagy nemmel válaszolj! (I/N)");
                    }

            } while (!(userCh.equals("I")) && !(userCh.equals("N")));
        }
        System.out.println();
        System.out.println("Köszönöm az érdeklődést, szép napot kívánok!");
    }
}