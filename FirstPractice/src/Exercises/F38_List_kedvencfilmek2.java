package Exercises;

            /* 38.Feladat (Órai) (Tamás megoldása)
            Írjatok egy programot, amely egy Listában eltárolja
            majd “visszaolvassa” a felhasználónak azt az 5 kedvenc
            filmjét, amit bekértünk tőle a konzol segítségével.
            (Külön ciklus készüljön a beolvasásra és mentésre és
            külön egy az eredmény kiírására) */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F38_List_kedvencfilmek2 {
    public static void main(String[] args) {
        //deklarációk
        List<String> movies = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //ciklus a beolvasáshoz
        for (int i = 0; i <= 5; i++) {
            System.out.println("which is your " + (i + 1) + " favourite movie?");
            movies.add(sc.nextLine());
        }

        //ciklus a kiíráshoz
        for (String currentMovie : movies) {
            System.out.print(currentMovie + ", ");
        }
    }
}
