package Temps;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

/*
        try {
           utasitas1;
           utasitas2;
              ...
           utasitasn;
        } catch (ExceptionType exceptionvariable) {
           utasitas1;
           utasitas2;
              ...
           utasitasn;
        }
 */

        System.out.println("Program1 execution started.");
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println(args[1]);  // a catch utáni zárójel első kifejezése a hibaüzenetből lett bemásolva, ami egy "gyereke" az Exeception osztálynak - azaz, ez egy Exeception típus, aminek akkor van jelentősége, ha konkrétan meg akarunk mutatni, hogy milyen jellegű hiba keletkezhet
        } catch (
                ArrayIndexOutOfBoundsException ex) { // a zárójelben lévő rövid kifejezés egy változó, amely tárolja a hibát, amelyet ki is írathatunk egyel lentebb
            System.out.println("No luck with array handling from program arguments: " + ex); // ez az a hiba, ami try catch nélkül pirossal jelent volna meg a consolon (bár nem szokás ezt az információt a felhasználónak odaadni)
        }

        try {
            System.out.println("Give me a number: ");
            int number = Integer.parseInt(scan.next());
        } catch (NumberFormatException ex) {
            System.out.println("No luck with user input from console. Because they said not int: " + ex);
        }

        System.out.println("Program1 execution end.");
        System.out.println();


        System.out.println("----------Több catch ág----------");
        // több catch ág is lehet, ahol külön megadjuk, hogy melyikben melyik típusú
        // hibát kezelje - így maga a kezelés is eltérhet
        int a = -10;
        int b = 0;
        double res = 0;
        System.out.println("try előtt");
        try {
            int[] exampleArray = {21, 44, 33, 77};
            System.out.println(exampleArray[15]);

            System.out.println("kifejezés előtt");
            res = a / b;                           // ha a try-ban több utasítás van és valamelyiknél hiba keletkezik, akkor a többi utasítás a (try-on belül) már nem fut le
            System.out.println("kifejezés után");
            if (a < 0) {
                throw new IllegalStateException(); // ha le is fut a programunk, de az eredmény mégsem jó számunkra (vagyis nem dobna hibát), akkor létrehozhatunk a "throw new" utasítással egy hivatkozást egy adott hibatípusra, amit lentebb kezelünk
            }
        } catch (ArithmeticException e) {
            System.out.println("catchben");
        } catch (IllegalStateException e) {
            System.out.println("catchben2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("tömb hiba");
        } finally {
            System.out.println("mindig lefut"); // ez egy olyan speciális ág, ami mindig lefut hiba nélkül is (pl. bármilyen hibakezelés is történt előtte, egy fájlt ki kell írnunk lemezre)

        }
        System.out.println("catch után");
        System.out.println();


        System.out.println("----------Hibakezelés metóduson kívül----------");

        try {
            arrayMethod();     // metódus meghívása a try-on belül
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Hey, there is no such an index in the array!");
        }
        System.out.println("Thanks for using our service!");
    }

    // a throws utasítással visszautalás a hibakezelés helyére
    public static void arrayMethod() throws ArrayIndexOutOfBoundsException {  // nem minden esetben van szükség throws-ra, csak bizonyos hibáknál
        int[] exampleArray = {21, 44, 33, 77};
        System.out.println(exampleArray[15]);
    }
}

// A throw akkor kell, amikor te magad akarsz egy exception-t létrehozni, amit valahol később le kell kezelni.
// A throws pedig akkor kell, amikor az expectiont, ami keletkezik/keletkezhet (mindegy, hogy te hoztad létre
// throw-al vagy "gyárilag" keletkezik, mert mondjuk a tömb olyan elemére hivatkozol, ami nem létezik),
// nem az adott metódusban akarjuk elkapni try-catch-ben, hanem tovább passzoljuk, továbbdobjuk a metódusból
// oda, ahol a metódushívás történik, hogy majd ott kelljen lekezelni (az exception-t) egy új try -catch-el,
// vagy ismét továbbdobni throws-el.
// Exception-ök esetében mindig ez a két opciónk van. Catch-el elkapjuk, vagy tovább dobjuk throws-al.
