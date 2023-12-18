package Exercises;

            /* 47. Feladat (saját megoldás)
            Írjunk programot, ami összeszámolja a dolgozói szavazatokat,
            amely a karácsonyi party helyszínével kapcsolatos. Szerencsére
            egy gyakornok összegyűjtötte a szavazatokat egy Listába, íme:
            "Rumour", "Babel", "Babel","Babel", "Babel","Babel", "Babel",
            "Babel", "Babel","Babel", "Babel","Babel", "Babel","Rumour",
            "Babel", "Babel", "Rumour","Rumour", "Rumour","Babel", "Babel",
            "Rumour","Rumour", "Rumour", "Babel", "Rumour", "Rumour",
            "Rumour", "Rumour", "Rumour", "Rumour", "Babel", "Rumour",
            "Rumour", "Rumour","Babel", "Babel", "Rumour", "Rumour",
            "Rumour", "Rumour".
            Készítsünk egy List-et ezzel a kezdőértékkel és számoljuk meg
            a szavazatokat, majd írjuk ki a győztes helyet a képernyőre. */

import java.util.Arrays;
import java.util.List;

public class F47_List_Szavazatszamlalas {
    public static void main(String[] args) {

        List<String> voteList = Arrays.asList("Rumour", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Rumour");

        int rumourCounter = 0;
        int babelCounter = 0;
        for (String vote : voteList)
            if (vote.equals("Rumour"))
                rumourCounter += +1;
            else
                babelCounter += +1;

        System.out.println("A Rumourra "+rumourCounter+ ", a Babelre "+babelCounter+ " szavazat érkezett.");
        if (rumourCounter > babelCounter)
            System.out.println("A versenyt a Rumour nyerte.");
         else if (rumourCounter < babelCounter)
            System.out.println("A versenyt a Babel nyerte.");
         else
            System.out.println("Az eredmény döntetlen lett.");
    }
}
