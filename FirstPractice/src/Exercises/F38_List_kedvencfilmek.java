package Exercises;

            /* 38.Feladat (Órai) (saját megoldás)
            Írjatok egy programot, amely egy Listában eltárolja
            majd “visszaolvassa” a felhasználónak azt az 5 kedvenc
            filmjét, amit bekértünk tőle a konzol segítségével.
            (Külön ciklus készüljön a beolvasásra és mentésre és
            külön egy az eredmény kiírására) */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F38_List_kedvencfilmek {
    public static void main(String[] args) {

        List<String> filmList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Kérlek, sorold fel az 5 kedvenc filmed!");

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println(i + 1 + ". film:");
            filmList.add(scan.next());
            }

        System.out.println("A kedvenc filmjeid:");
        for (String item : filmList)
            System.out.println(item);
        }
    }

