package Exercises;

import java.util.Scanner;

         /* 24.d Feladat (saját megoldás)

         Készítsetek szlogen automatát, amely a felhasználó által beolvasott
         márkára visszaadja a felhasználónak az adott márka szlogenjét.
         Switch-case adatszerkezettel oldjátok meg. És induljon újra automatikusan
         a program mindaddig, amíg a márka helyett “exit”-et nem ír a felhasználó.
         A szlogen visszaadása után kérdezzük meg a felhasználót, hogy kíváncsi-e
         új szlogenre. Yes/No. Yes esetén mindig újraindul a program, No esetén szép
         napot kívánunk neki és kilépünk. */

public class F24d_Szlogenek_While_I_N_EXIT {
    public static void main(String[] args) {

        Scanner scanSlogen = new Scanner(System.in);
        String brand = "";
        String userCh = "";

        while ((!brand.equals("EXIT"))) {
            System.out.println();
            System.out.println("Kérlek, írj be egy cégnevet:");
            brand = scanSlogen.next().toUpperCase();
            while (!(brand.equals("NIKE")) && (!brand.equals("APPLE")) && (!brand.equals("VOLKSWAGEN")) && (!brand.equals("REDBULL"))
                    && (!brand.equals("PEPSI")) && (!brand.equals("EXIT"))) {
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
                default:
                    brand = ("EXIT");
                    break;
            }
            boolean userAnswer = false;
            do {
                if (brand.equals("EXIT")) {
                    userAnswer = false;
                    brand = ("EXIT");
                } else {
                    System.out.println();
                    System.out.println("Szeretnél még új szlogent?");
                    userCh = scanSlogen.next().toUpperCase();
                    if ((userCh.equals("N")) || (userCh.equals("EXIT"))) {
                        userAnswer = false;
                        brand = ("EXIT");
                    } else if (userCh.equals("I")){
                        userAnswer = false;
                    }  else if (!userCh.equals("I")) {
                        System.out.println("Kérlek igennel, vagy nemmel válaszolj! (I/N)");
                        userAnswer = true;
                    }
                }
            } while (userAnswer == true);
            //} while (!(userCh.equals("I")) && !(userCh.equals("N")) && (userCh.equals("EXIT")));
        }
        System.out.println();
        System.out.println("Köszönöm az érdeklődést, szép napot kívánok!");
    }
}






