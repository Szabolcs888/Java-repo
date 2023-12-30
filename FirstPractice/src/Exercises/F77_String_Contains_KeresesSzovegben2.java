package Exercises;

            /* 77. Feladat (Órai) (Zsolt megoldása)
            Készítsünk egy metódust, amely a konzolról beolvas egy szöveget,
            majd a szintén beolvasott keresendő szövegről eldönti, hogy
            szerepel-e a szövegben. Amennyiben igen, térjen vissza true-val,
            egyébként false-al. */

import java.util.Scanner;

public class F77_String_Contains_KeresesSzovegben2 {
    public static void main(String[] args) {
        String longtext = getInputFromUser();
        String searchtext = getInputFromUser();
        boolean result = isStringPresent(longtext, searchtext);
        System.out.println(result);

        // ugyanazt eredményezi mint a fenti kód
        //System.out.println(isStringPresent(getInputFromUser(), getInputFromUser()));
    }

    public static boolean isStringPresent(String text, String search) {
        /* hosszabb megoldása a vizsgálatnak
         if(text.contains(search)){
            return true;
        }else{
            return false;
        }
         */
        return text.contains(search);
    }

    public static String getInputFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add a string: ");
        return scan.nextLine();
    }
}
