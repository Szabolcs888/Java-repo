package Exercises;

            /* 61. Feladat (Órai) (saját megoldás)
            Készítsünk egy metódust, amely kapott szám esetén eldönti,
            hogy az 18-nál nagyobb-e. Ha igen, kiírja hogy “Elmúltál 18,
            jogosult vagy a belépésre!”, egyébként pedig írja ki, hogy
            “Nem vagy még 18, sicc innen!” */

import java.util.Scanner;

public class F61_Met_EletkorFilter {
    public static void main(String[] args) {

        int userAge = readFromUser();
        ageFilter(userAge);
    }

    public static int readFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hány éves vagy?");
        return scan.nextInt();
    }

    public static void ageFilter(int szam) {
        if (szam >= 18) {
            System.out.println("Elmúltál 18, jogosult vagy a belépésre!");
        } else
            System.out.println("Nem vagy még 18, sicc innen!");
    }
}


