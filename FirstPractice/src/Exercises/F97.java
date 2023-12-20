package Exercises;

import java.time.LocalDate;

public class F97 {
    public static void main(String[] args) {

        LocalDate matchDay = LocalDate.parse("2024-01-26");

        int count = 1;
        while (count <= 12) {
            System.out.println(matchDay);
            matchDay = matchDay.plusDays(7);
            count++;
        }
    }
}
