package Exercises;

import java.util.Random;

        /* 6. Feladat
        Készítsetek szerencsesüti programot,
        amely minden futtatása során kiír egy kis bölcs üzenetet.
        A program véletlenszerűen írjon ki üzeneteket, amit előre felvettünk benne.
        Mindig csak egyet. */

public class F06_NapiBolcsesseg {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Napi bölcsesség:");

        Random random = new Random();
        int randomNumber = random.nextInt(8);

        if (randomNumber == 0) {
            System.out.println("Időnként hátra kell lépni, hogy nagyobbat lehessen előre ugrani.");
        } else if (randomNumber == 1) {
            System.out.println("Még a legártatlanabb dolog is pusztíthat, ha túlzásba viszik.");
        } else if (randomNumber == 2) {
            System.out.println("Sok mindenért érdemes élni, és néhány dologért érdemes meghalni is.");
        } else if (randomNumber == 3) {
            System.out.println("Szeretni annyit jelent, mint a jövő felé fordulni, és továbbadni az életet.");
        } else if (randomNumber == 4) {
            System.out.println("Értelmet azáltal viszünk az életünkbe, ahogy a világot szeretjük.");
        } else if (randomNumber == 5) {
            System.out.println("Ne a bajaidat tartsd számon, hanem mindazon jót, amelyben részesültél.");
        } else if (randomNumber == 6) {
            System.out.println("Nem az számít ki honnan jött, hanem az, hogy hová tart.");
        } else if (randomNumber == 7) {
            System.out.println("A foltos gyöngyszemet ki lehet csiszolni s visszakaphatja eredeti fényét, de a könnyelműen kiejtett szónak nincs orvossága.");
        }
    }
}
