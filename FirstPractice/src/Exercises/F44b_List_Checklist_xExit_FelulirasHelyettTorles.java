package Exercises;

            /* 44.b Feladat (saját megoldás)
            Írjatok egy nyaralós checklist programot, amelybe
            tudjátok rögzíteni, hogy mik azok a tevékenységek,
            dolgok, amiket a nyaralás elindulása előtt el kell
            intézni, vagy el kell tenni, hogy minden meglegyen,
            rendben legyen. Ha ‘X’-et ír tevékenység helyett,
            akkor fejezze be az elemek hozzáadását. Amennyiben
            a felhasználó azt az elemet adja meg, ami már
            létezik a listában, úgy akkor azt törölje onnan.
            (jelezve, hogy az a feladat/tevékenység teljesült) */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F44b_List_Checklist_xExit_FelulirasHelyettTorles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> eventList = new ArrayList<>();
        String event = "";

        System.out.println();
        System.out.println("Kérlek, sorold fel a nyaralás előtti elintéznivalóidat! Az 'X' megnyomására összegez a program.");

        do {
            System.out.println();
            System.out.println(eventList.size() + 1 + ". teendő:");
            event = scan.next();
            if (eventList.contains(event)) {
                System.out.println("A(z) " + event + " teendő törlésre került!");
                eventList.remove(event);
            } else if (!event.equalsIgnoreCase("X")) {
                eventList.add(event);
            }
            // ez így nem annyira szép, de mindenképpen a sor végén kell lennie és csak if-fel teljesül a feltétel
            if ((!event.equalsIgnoreCase("X")) && !eventList.isEmpty()) {
                System.out.println();
                System.out.println("A lista eddigi tartalma: " + eventList);
            }
        } while (!event.equalsIgnoreCase("X")); // (!(element.toLowerCase().equals("x"))) : ezzel az utasítással kiváltható a két feltétel (és csak az x lenyomására fog vonatkozni, a tételekre nem.

        System.out.println();
        System.out.println("Teendőid listája:");

        for (String item : eventList)
            System.out.println(item);
    }
}
