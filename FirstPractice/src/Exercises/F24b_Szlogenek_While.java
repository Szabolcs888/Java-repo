package Exercises;

import java.util.Scanner;

         /* 24.b Feladat (saját megoldás)
         Készítsetek szlogen automatát, amely a felhasználó által beolvasott
         márkára visszaadja a felhasználónak az adott márka szlogenjét.
         Switch-case adatszerkezettel oldjátok meg. És induljon újra automatikusan
         a program mindaddig, amíg a márka helyett “exit”-et nem ír a felhasználó */

public class F24b_Szlogenek_While {
    public static void main(String[] args) {

        Scanner scanSlogen = new Scanner(System.in);
        String brand = "";

        while ((!brand.equals("EXIT"))) {
            System.out.println();
            System.out.println("Kérlek, írj be egy cégnevet:");
            brand = scanSlogen.next();
            brand = brand.toUpperCase();
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
                        System.out.println();
                        System.out.println("Ezt a cégnevet nem ismerem.");

            }
        }
    }
}