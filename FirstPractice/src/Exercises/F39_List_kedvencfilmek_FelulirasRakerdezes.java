package Exercises;

            /* 39.Feladat (Órai) (saját megoldás)
            Fejlesszük tovább az előző feladatot úgy, hogy
            csak akkor mentse el a beolvasott filmet, ha még
            előzetesen nem adta meg azt. Vagyis kerüljük el
            azt, hogy ha a lista eleme már létezik, akkor ne
            adhassuk újra hozzá. Összesen 5 filmet kérjünk be. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F39_List_kedvencfilmek_FelulirasRakerdezes {
    public static void main(String[] args) {

        List<String> filmList = new ArrayList<>();
        String film = "";

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Kérlek, sorold fel az 5 kedvenc filmed!");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            boolean filmRepeat = true;
            while (filmRepeat == true) {
                System.out.println(i + 1 + ". film:");
                film = scan.next();
                if (filmList.contains(film)) {
                    System.out.println();
                    System.out.println("Ez a film már szerepel a listán!");
                } else {
                    filmList.add(film);
                    filmRepeat = false;
                }
            }
        }

        System.out.println("A kedvenc filmjeid:");
        for (String item : filmList)
            System.out.println(item);
    }
}