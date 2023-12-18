package Exercises;

import java.util.Scanner;

        /* 11.a Feladat1/2 (bővített)
        Készítsetek egy összegző programot,
        ami egész számokat olvas be a felhasználótól mindaddig,
        amíg az az x karaktert nem adja meg szám helyett.
        Amikor ez megtörténik, írjuk ki a megadott számok összegét.
        Készítsük el while-al */

public class F11a_Osszeadas1_While2 {
    public static void main(String[] args) {

        Scanner userScan = new Scanner(System.in);     // bekérjük az usertől az adatot
        System.out.println("Kérek egy számot: ");

        int result = 0;
        int counter = 0;
        while (true) {
            String currentInput = userScan.next();     // elmentjük egy változóba a user által beírt adatot
            if (currentInput.equals("x")) {            // ha a user által megadott érték x, akkor végrehajtódik a következő sor (maga a (currentInput.equals("x")) utasítás ugyanazt jelenti, mintha azt kéreznénk, hogy currentInput == x , de mivel Stringnél nem lehetséges ilyen jellegű parancs, ezért van rá más utasítás (tehát egy változó értékét így hasonlítjuk össze egy Stringgel))
                break;
            }
            int curInpAsInteger = Integer.parseInt(currentInput); // átalakítjuk a Stringet számmá, amit egy változóba teszünk
            result = result + curInpAsInteger;                   // a result változóba pedig az aktuális eredmény kerül
            System.out.println("Kérek még egy számot: ");
            counter++;                                           // a ciklusokat számolja
        }
        System.out.println("Az összeg: " + result);
        System.out.println("Ennyi számot adtál össze: " + counter);
    }
}
