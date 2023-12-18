package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 23. Feladat (Saját megoldás)
        Készítsétek el a szerencsesüti program switch case
        szerinti megvalósítását. Cseréljétek le az if/else
        if/else blokkokat switch case-ekkel.

        És ki van egészítve egy while ciklussal, ami rákérdez,
        hogy szeretne-e a felhasználó újabb bölcsességet.*/

public class F23_NapiBolcsesseg1_SwitchCAndWhile {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Napi bölcsesség:");

        String userAnswer = "i";
        while (userAnswer.equals("i")) {
            Random random = new Random();
            int randomNumber = random.nextInt(8);
            switch (randomNumber) {
                case 0:
                    System.out.println("Időnként hátra kell lépni, hogy nagyobbat lehessen előre ugrani.");
                    break;
                case 1:
                    System.out.println("Még a legártatlanabb dolog is pusztíthat, ha túlzásba viszik.");
                    break;
                case 2:
                    System.out.println("Sok mindenért érdemes élni, és néhány dologért érdemes meghalni is.");
                    break;
                case 3:
                    System.out.println("Szeretni annyit jelent, mint a jövő felé fordulni, és továbbadni az életet.");
                    break;
                case 4:
                    System.out.println("Értelmet azáltal viszünk az életünkbe, ahogy a világot szeretjük.");
                    break;
                case 5:
                    System.out.println("Ne a bajaidat tartsd számon, hanem mindazon jót, amelyben részesültél.");
                    break;
                case 6:
                    System.out.println("Nem az számít ki honnan jött, hanem az, hogy hová tart.");
                    break;
                case 7:
                    System.out.println("A foltos gyöngyszemet ki lehet csiszolni s visszakaphatja eredeti fényét, de a könnyelműen kiejtett szónak nincs orvossága.");
                    break;
            }
            System.out.println();
            System.out.println("Szeretnél még egy bölcsességet? i/n");
            Scanner scanString = new Scanner(System.in);
            userAnswer = scanString.next();
        }
    }
}
