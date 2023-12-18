package Temps.ReadFrom_WriteTo;

public class ReadProgramArguments {
    public static void main(String[] args) {

        /* Az args változóba két számot tettünk (21 és 8) az Edit Configurations menüben,
         a Program arguments rovatban. Azaz, kívülről adtunk meg adatokat. */

        System.out.println(args[0]); // kiíratjuk az első számot (ami valójában egy String)
        System.out.println(args[1]); // kiíratjuk a második számot (ami valójában egy String)

        int a = Integer.parseInt(args[0]); // itt egy változónak (a) az első argument értékét adjuk meg (az utasítás egyben azt is magában foglalja, hogy a Stringként érkező argument számadattá változzon)
        System.out.println(a); // az a változó kírása


       /* Nem tartozik az argumentekhez!
       Ez egy példa String számmá való átalakítására, és már számként való használatára, kiíratására.
       Az eredmény 11 lesz. */
       // System.out.println(Integer.parseInt("5") +6); // ezzel az utasítással is átalakításra kerül a String számmá
    }
}
