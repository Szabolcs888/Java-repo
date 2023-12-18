package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 17.a Feladat (Órai) (saját megoldás)
        Mivel nulláról építettem fel, ezért eltér az órai megoldástól és egy kissé
        bonyolultabb is lett. A gyakorlatban majd az órai változatot kell előnyben
        részesíteni.

        Fejlesszétek tovább a kő-papír-olló játékot. A játék ne érjen
        véget egy kör után, hanem addig folytatódjon, amíg a felhasználó
        a három megengedett eszköz helyett az X karaktert adja meg.
        A játék számolja a pontokat, minden győztes kör 3 pontot ér,
        a döntetlen pedig 1 pont mindkét félnek. Az “x” karakter leütése
        után írja ki, hogy vége a játéknak, valamint hogy kinek hány pontja lett. */

public class F17a_KoPapirOllo_VegtelenCiklus {
    public static void main(String[] args) {

        Random rng = new Random();
        Scanner scanString = new Scanner(System.in);

        String compCh = "";

        System.out.println();
        System.out.println("Üdvözöllek a KŐ-PAPÍR-OLLÓ játékban! Sok szerencsét!");

        int userPoints = 0;
        int compPoints = 0;
        int counter = 1;
        while (true) {
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
            System.out.println(counter + ". forduló");
            System.out.println("Kérlek, válassz egyet: kő, papír vagy olló");

            String userCh = scanString.next().toLowerCase();

            while (!userCh.equals("kő") && !userCh.equals("papír") && !userCh.equals("olló") && !userCh.equals("x")) {
                System.out.println();
                System.out.println("Kérlek, írj be helyes kifejezést!");
                userCh = scanString.next();
            }
            if (userCh.equals("x")) {
                break;
            } else if (((userCh.equals("kő")) && (compCh.equals("olló"))) || ((userCh.equals("papír")) && (compCh.equals("kő"))) || ((userCh.equals("olló")) && (compCh.equals("papír")))) {
                System.out.println();
                System.out.println("A te választásod: " + userCh);
                System.out.println("A gép választása: " + compCh);
                System.out.println();
                System.out.println("A " + counter + ". fordulót te nyerted.");
                userPoints = userPoints + 3;
            } else if (((userCh.equals("kő")) && (compCh.equals("papír"))) || ((userCh.equals("papír")) && (compCh.equals("olló"))) || ((userCh.equals("olló")) && (compCh.equals("kő")))) {
                System.out.println();
                System.out.println("A te választásod: " + userCh);
                System.out.println("A gép választása: " + compCh);
                System.out.println();
                System.out.println("A " + counter + ". fordulót a gép nyerte.");
                compPoints = compPoints + 3;
            } else {
                System.out.println();
                System.out.println("A te választásod: " + userCh);
                System.out.println("A gép választása: " + compCh);
                System.out.println();
                System.out.println("A " + counter + ". forduló döntetlen lett.");
                userPoints++;
                compPoints++;
            }
            counter++;
            System.out.println();
            System.out.println("A játékos pontjainak száma: " + userPoints);
            System.out.println("A gép pontjainak száma: " + compPoints);
        }
        System.out.println();
        System.out.println("A játék végetért.");
        System.out.println();
        if (userPoints > compPoints) {
            System.out.println("Gratulálok, te nyertél " + userPoints + " : " + compPoints + " arányban!");
        } else if (userPoints < compPoints) {
            System.out.println("A gép nyert " + compPoints + " : " + userPoints + " arányban! Legközelebb több szerencséd lesz.");
        } else {
            System.out.println("A végeredmény döntetlen lett. Te és a gép is " + userPoints + " - " + compPoints + " pontot szereztetek.");
        }
    }
}
