package Exercises;

import java.util.Scanner;

         /* 24.a Feladat (saját megoldás)
         Készítsetek szlogen automatát, amely a felhasználó által beolvasott
         márkára visszaadja a felhasználónak az adott márka szlogenjét.
         Switch-case adatszerkezettel oldjátok meg */

public class F24a_Szlogenek {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Kérlek, írj be egy cégnevet.");

        Scanner scanInt = new Scanner(System.in);
        String brand = scanInt.next().toUpperCase();

        switch (brand){
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
        }
    }
}
