package Exercises;

            /* 51. Feladat (saját megoldás)
            Írjatok egy nyaralós checklist programot, amelybe tudjátok
            rögzíteni, hogy mik azok a tevékenységek, dolgok amiket a
            nyaralás elindulása előtt el kell intézni, vagy el kell
            tenni, hogy minden meglegyen, rendben legyen. Ha ‘X’-et ír
            tevékenység helyett, akkor fejezze be az elemek hozzáadását. */

import java.util.*;

public class F51_Set_Checklist_xExit_nincsFeluliras_Ua44aList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<String> eventList = new HashSet<>();
        String event = "";

        System.out.println();
        System.out.println("Kérlek, sorold fel a nyaralás előtti elintéznivalóidat! Az 'X' megnyomására összegez a program.");

        do {
            System.out.println();
            System.out.println(eventList.size() + 1 + ". teendő:");
            event = scan.next();
            if (eventList.contains(event)) {
                System.out.println("Ez a teendő már hozzáadásra került!");
            } else if (!event.equalsIgnoreCase("X")) {
                eventList.add(event);
            }
        } while (!(event.toLowerCase().equals("x")));

        System.out.println();
        System.out.println("Teendőid listája:");

        for (String item : eventList)
            System.out.println(item);

    }
}
