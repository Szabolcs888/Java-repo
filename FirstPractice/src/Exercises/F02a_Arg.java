package Exercises;
            /* 2.a Feladat (Órai)
            Készítsünk programot, ami a megadott két számot, “a”-t és “b” letárolja,
            majd megmondja mennyi lesz a maradék, ha “a”-t elosztjuk “b”-vel.
            Parancssori argumentumként olvassa be a számokat */

public class F02a_Arg {
    public static void main(String[] args) {

        /* Az args változóba két számot tettünk az Edit Configurations menüben,
         a Program arguments rovatban. Azaz, kívülről adtunk meg adatokat. */

        int a = Integer.parseInt(args[0]); // az a változó értékének az első argument értékét adjuk meg (az utasítás egyben azt is magában foglalja, hogy a Stringként érkező argument számadattá változzon)
        int b = Integer.parseInt(args[1]); // az b változó értékének a második argument értékét adjuk meg

        System.out.println(a % b);
    }
}
