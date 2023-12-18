package Exercises;

            /* 44.c Feladat (Zsolt megoldása)
            Írjatok egy nyaralós checklist programot, amelybe
            tudjátok rögzíteni, hogy mik azok a tevékenységek,
            dolgok, amiket a nyaralás elindulása előtt el kell
            intézni, vagy el kell tenni, hogy minden meglegyen,
            rendben legyen. Ha ‘X’-et ír tevékenység helyett,
            akkor fejezze be az elemek hozzáadását. Amennyiben
            a felhasználó azt az elemet adja meg, ami már
            létezik a listában, úgy akkor azt törölje onnan.
            (jelezve, hogy az a feladat/tevékenység teljesült)
            Amennyiben elfogyott minden elem a listáról, akkor
            írja ki a program, hogy “Minden megvan, indulhat a
            nyaralás!” */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F44c_List_Checklist_xExit_FelulirasHelyettTorles_UresListaExit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> vacationCheckList = new ArrayList<>();
        boolean wantToAddMore = true;

        do {
            System.out.println("Debug: Checklist for the vacation: " + vacationCheckList);
            System.out.println("Add an item to your vacation checkList:");
            String item = scanner.nextLine();
            if (item.toUpperCase().equals("X")) {
                wantToAddMore = false;
            } else if (vacationCheckList.contains(item)) {
                System.out.println("Item is already there. So it will be removed.");
                vacationCheckList.remove(item);
                if (vacationCheckList.isEmpty()) {   //ua: vacationCheckList.size() == 0
                    System.out.println("All set, let's go to vacation! (and drink a beer)");
                    wantToAddMore = false;
                }
            } else {
                vacationCheckList.add(item);
            }
        } while (wantToAddMore);
    }
}
