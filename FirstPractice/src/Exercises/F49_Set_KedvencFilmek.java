package Exercises;

            /* 49. Feladat (saját megoldás)
            Írjatok egy programot, amely egy Set-ben eltárolja
            majd “visszaolvassa” a felhasználónak azt az 5
            kedvenc filmjét, amit bekértünk tőle a konzol
            segítségével. (Külön ciklus készüljön a beolvasásra
            és mentésre és külön egy az eredmény kiírására)  */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class F49_Set_KedvencFilmek {
    public static void main(String[] args) {

        Set<String> filmList = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Kérlek, add meg az 5 kedvenc filmed!");

        for (int i = 1; i < 6; i++) {
            System.out.println();
            System.out.println("Az " + i + ". film:");
            filmList.add(scan.next());
        }

        System.out.println();
        System.out.println("A kedvenc filmjeid: ");
        for (String item : filmList)
            System.out.println(item);
    }
}
