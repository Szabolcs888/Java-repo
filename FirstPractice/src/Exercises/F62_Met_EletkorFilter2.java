package Exercises;

            /* 62. Feladat (saját megoldás)
            Készítsetek egy getValidAgeFromConsole() metódust, amelyet
            a main metódusban meg tudunk hívni és visszaad egy helyes age-et
            integer-t amit a felhasználó a console-be írt. Akkor helyes egy
            age ha 0 és 140 között van (0 lehet, 140 nem). A metódus
            visszatérési értékét mentsük le egy age nevű változóba, majd
            írassuk ki a képernyőre annak tartalmát.

            Több lépésben készítettem el az elvártnál, hogy jobban
            gyakorolhassam a metódusok alapjait. */

import java.util.Scanner;

public class F62_Met_EletkorFilter2 {
    public static void main(String[] args) {

        int age = getValidAgeFromConsole();
        boolean acceptAge = ageFilter(age);
        print(acceptAge, age);
    }

    public static int getValidAgeFromConsole() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hány éves vagy?");
        return scan.nextInt();
    }

    public static boolean ageFilter(int szam) {
        return szam < 140 && 0 <= szam;
    }

    public static void print(boolean choice, int userAge) {
        if (choice)
            System.out.println("A(z) " + userAge + " megfelel a követelményeknek.");
    }
}


