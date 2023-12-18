package Exercises;

            /* 39.Feladat (Órai) (Tamás megoldása)
            Fejlesszük tovább az előző feladatot úgy, hogy
            csak akkor mentse el a beolvasott filmet, ha még
            előzetesen nem adta meg azt. Vagyis kerüljük el
            azt, hogy ha a lista eleme már létezik, akkor ne
            adhassuk újra hozzá. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F39_List_kedvencfilmek_FelulirasRakerdezes2 {
    public static void main(String[] args) {
        //deklarációk
        List<String> movies = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //ciklus a beolvasáshoz
        for (int i = 0; i < 5; i++) {
            System.out.println("which is your " + (i + 1) + " favourite movie?");
            String movieFromConsole = sc.nextLine();
            if (movies.contains(movieFromConsole)) {
                System.out.println("This is already in the list. Be more creative");
                i--;
            } else {
                movies.add(movieFromConsole);
            }
        }

        //ciklus a kiíráshoz
        for (String currentMovie : movies) {
            System.out.print(currentMovie + ", ");
        }
    }
}