package Exercises;

/*
98)	Készítsetek egy programot amely kiírja az aktuális napot és még 10 darab napot,
 melyek az ezt követő hónapban vannak. (Tehát minden egyes kiírt nap pontosan egy hónappal
  későbbi az előző dátumnál)
 */

import java.time.LocalDate;

public class F98 {

    public static void main(String[] args) {
        LocalDate Day = LocalDate.parse("2023-12-20");

        int count = 1;
        while (count <= 11) {
            System.out.println(Day);
            Day = Day.plusMonths(1);
            count++;
        }
    }

}
