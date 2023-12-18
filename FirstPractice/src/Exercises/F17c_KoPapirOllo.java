package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 17.c Feladat (Órai) (saját megoldás)
        Mivel nulláról építettem fel, ezért eltér az órai megoldástól és egy kissé
        bonyolultabb is lett. A gyakorlatban majd az órai változatot kell előnyben
        részesíteni.

        Fejlesszétek tovább a kő-papír-olló játékot. A játék ne érjen
        véget egy kör után, hanem addig folytatódjon, amíg a felhasználó
        a három megengedett eszköz helyett az X karaktert adja meg.
        A játék számolja a pontokat, minden győztes kör 3 pontot ér,
        a döntetlen pedig 1 pont mindkét félnek. Az “x” karakter leütése
        után írja ki, hogy vége a játéknak, valamint hogy kinek hány pontja lett.

        Tíz kör után fixen véget ér a játék, ha X-et írt a felhasználó ha nem.
        Minden 3. kör dupla pontot ér, és minden 7. kör tripla pontot. */

public class F17c_KoPapirOllo {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Üdvözöllek a KŐ-PAPÍR-OLLÓ játékban!");
        System.out.println();
        System.out.println("A játék 10 körös. A győztes körök 3 pontot érnek, a döntetlen 1 - 1 pontot, ");
        System.out.println("kivéve minden harmadik kört, amelyek dupla pontot érnek és a hetedik kört, ");
        System.out.println("amely háromszoros pontot ér. Az X lenyomásával bármelyik körben kiléphetsz.");
        System.out.println();
        System.out.println("Sok szerencsét!");

        Random rng = new Random();
        Scanner scanString = new Scanner(System.in);

        int userPoints = 0;
        int compPoints = 0;
        int counter = 1;
        while (counter <= 10) {
            int computerNum = rng.nextInt(1, 4);
            String compCh = "";
            switch (computerNum) {
                case 1:
                    compCh = "KŐ";
                    break;
                case 2:
                    compCh = "PAPÍR";
                    break;
                case 3:
                    compCh = "OLLÓ";
            }

            System.out.println();
            System.out.println(counter + ". forduló");
            System.out.println("Kérlek, válassz egyet: kő, papír vagy olló");

            String userCh = scanString.next().toUpperCase();

            while (!userCh.equals("KŐ") && !userCh.equals("PAPÍR") && !userCh.equals("OLLÓ") && !userCh.equals("X")) {
                System.out.println();
                System.out.println("Kérlek, írj be helyes kifejezést!");
                userCh = scanString.next().toUpperCase();
            }
            if (userCh.equals("X")) {
                break;
            } else if (((userCh.equals("KŐ")) && (compCh.equals("OLLÓ"))) || ((userCh.equals("PAPÍR")) && (compCh.equals("KŐ"))) || ((userCh.equals("OLLÓ")) && (compCh.equals("PAPÍR")))) {
                System.out.println();
                System.out.println("A te választásod: " + userCh);
                System.out.println("A gép választása: " + compCh);
                System.out.println();
                System.out.println("A " + counter + ". fordulót te nyerted.");
                if (counter % 3 == 0) {
                    userPoints = userPoints + 3 * 2;
                } else if (counter % 7 == 0) {
                    userPoints = userPoints + 3 * 3;
                } else {
                    userPoints = userPoints + 3;
                }
            } else if (((userCh.equals("KŐ")) && (compCh.equals("PAPÍR"))) || ((userCh.equals("PAPÍR")) && (compCh.equals("OLLÓ"))) || ((userCh.equals("OLLÓ")) && (compCh.equals("KŐ")))) {
                System.out.println();
                System.out.println("A te választásod: " + userCh);
                System.out.println("A gép választása: " + compCh);
                System.out.println();
                System.out.println("A " + counter + ". fordulót a gép nyerte.");
                if (counter % 3 == 0) {
                    compPoints = compPoints + 3 * 2;
                } else if (counter % 7 == 0) {
                    compPoints = compPoints + 3 * 3;
                } else {
                    compPoints = compPoints + 3;
                }
            } else {
                System.out.println();
                System.out.println("A te választásod: " + userCh);
                System.out.println("A gép választása: " + compCh);
                System.out.println();
                System.out.println("A " + counter + ". forduló döntetlen lett.");
                if (counter % 3 == 0) {
                    userPoints = userPoints + 2;
                    compPoints = compPoints + 2;
                } else if (counter % 7 == 0) {
                    userPoints = userPoints + 3;
                    compPoints = compPoints + 3;
                } else {
                    userPoints++;
                    compPoints++;
                }
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
