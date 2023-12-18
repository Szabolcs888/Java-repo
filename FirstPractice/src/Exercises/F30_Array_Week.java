package Exercises;
            /* 30 Feladat (Órai) (az első saját megoldás és Zsolt megoldása)
            Készítsünk egy tömböt, amiben tároljuk a hét napjait
            és írassuk ki az elemeit egy ciklussal majd külön egy
            napot is, amelyik a kedvenc napunk. */

public class F30_Array_Week {
    public static void main(String[] args) {

        String[] weekArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < weekArray.length; i++) {
            System.out.println(weekArray[i]);
        }
        System.out.println();
        System.out.println("My favorite day is " + weekArray[5]);


        System.out.println();
        //  másik megoldás

        String[] week = new String[7];
        week[0] = "Monday";
        week[1] = "Tuesday";
        week[2] = "Wednesday";
        week[3] = "Thursday";
        week[4] = "Friday";
        week[5] = "Saturday";
        week[6] = "Sunday";

        for (int t = 0; t < week.length; t++) {
            System.out.println(week[t]);
        }
        System.out.println("Favorite day: " + week[4]);
    }
}

