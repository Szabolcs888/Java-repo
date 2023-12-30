package Exercises;

            /* 76. Feladat (Órai) (saját megoldás)
            Készítsünk egy konzolról beolvasó metódust, amely a beírt szöveget Stringként
            beolvassa és eltávolítja a felesleges szóközöket az elejéről és végéről, majd
            visszaadja azt. Építsünk bele olyan logikát, hogy ha 0 hosszú a bevitt
            kifejezés, akkor írjon ki a konzolra hibaüzenetet. */

import java.util.Scanner;

/*
        main();
            readFromUser();
            stringCutMethod();
            print();
*/

public class F76_String_Trim_Isempty {
    public static void main(String[] args) {
        String userString = readFromUser();
        String stringCut = stringCutMethod(userString);
        print(stringCut);
    }

    public static String readFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérlek, írj be egy szót az elején és a végén szóközzel!");
        String userString ="";
       do {
           userString = scan.nextLine();
            if (userString.isEmpty())
                System.out.println("Legalább 1 karakternek mindenképp kell lennie!");
        } while(userString.isEmpty());
            return userString;
    }

    private static String stringCutMethod(String userString) {
        String trimString = userString.trim();
        return trimString;
    }

    private static void print(String stringCut) {
        System.out.println(stringCut);
    }
}
