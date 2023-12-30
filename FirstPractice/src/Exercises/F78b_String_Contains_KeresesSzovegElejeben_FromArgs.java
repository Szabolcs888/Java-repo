package Exercises;

            /* 78.b Feladat (saját megoldás)
            Írjatok egy metódust, ami a paraméterként kapott szövegről, illetve a másik
            paraméterként kapott kifejezésről eldönti, hogy azzal a kifejezéssel kezdődik-e
            az adott szöveg vagy sem. Amennyiben igen, térjen vissza true-val, egyébként
            false-al.

            Parancssori argumentumként olvassunk be két értéket a main metódusban és
            hívjuk meg a készített metódust velük. */

/*
        main();
            searchingDecide();
            print();
*/

public class F78b_String_Contains_KeresesSzovegElejeben_FromArgs {
    public static void main(String[] args) {
        String argsText =  args[0];
        String argsSearchingString = args[1];
        boolean yON = searchingDecide(argsText, argsSearchingString);
        print(yON, argsSearchingString);
    }

    private static boolean searchingDecide(String userString, String searchingString) {
        return userString.startsWith(searchingString);
    }

    private static void print(boolean yON, String searchingString) {
        if (yON)
            System.out.println("A beírt szöveg eleje megegyezik a(z) \"" + searchingString + "\" keresőszóval.");
        else
            System.out.println(("A beírt szöveg eleje nem egyezik meg a(z) \"" + searchingString + "\" keresőszóval."));
    }
}