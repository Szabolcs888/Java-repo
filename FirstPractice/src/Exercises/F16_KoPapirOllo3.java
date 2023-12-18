package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 16. Feladat (Órai) (saját megoldás)
        Írjunk kő-papír-olló játékot. A program minden indítás után
        válasszon egy random eszközt, majd vesse össze a felhasználó
        által megadott eszközzel. Miután kiértékelte, hogy ki nyert, írja ki,
        hogy mi volt nála, és hogy ki nyerte a játékot. Figyeljünk rá, hogy
        a játékos csak a kő, papír, olló eszközöket választhassa. Ellenkező
        esetben írjunk ki egy figyelmeztető üzenetet. */

public class F16_KoPapirOllo3 {
    public static void main(String[] args) {

        Random rng = new Random();
        Scanner scanString = new Scanner(System.in);

        String compCh = "";

        System.out.println();
        System.out.println("Üdvözöllek a KŐ-PAPÍR-OLLÓ játékban!");

        int computerNum = rng.nextInt(1, 4);
        switch (computerNum) {    // a gép választásának eredményének átkonvertálása Stringgé (egy másik változóba), hogy összehasonlítható legyen a játékos tippjével
            case 1:
                compCh = "kő";
                break;
            case 2:
                compCh = "papír";
                break;
            case 3:
                compCh = "olló";
        }

        System.out.println();
        System.out.println("Kérlek, válassz egyet: kő, papír vagy olló");

        String userCh = scanString.next().toLowerCase();

        while (!userCh.equals("kő") && !userCh.equals("papír") && !userCh.equals("olló")) {
            System.out.println();
            System.out.println("Kérlek, írj be helyes kifejezést!");
            userCh = scanString.next();
        }
        if (((userCh.equals("kő")) && (compCh.equals("olló"))) || ((userCh.equals("papír")) && (compCh.equals("kő"))) || ((userCh.equals("olló")) && (compCh.equals("papír")))) {
            System.out.println();
            System.out.println("A te választásod: " + userCh);
            System.out.println("A gép választása: " + compCh);
            System.out.println();
            System.out.println("Te nyertél.");
        }
        else if (((userCh.equals("kő")) && (compCh.equals("papír"))) || ((userCh.equals("papír")) && (compCh.equals("olló"))) || ((userCh.equals("olló")) && (compCh.equals("kő")))) {
            System.out.println();
            System.out.println("A te választásod: " + userCh);
            System.out.println("A gép választása: " + compCh);
            System.out.println();
            System.out.println("A gép nyert.");
        }
          else {
            System.out.println();
            System.out.println("A te választásod: "+ userCh);
            System.out.println("A gép választása: "+ compCh);
            System.out.println();
            System.out.println("Döntetlen lett.");
            }
    }
}


