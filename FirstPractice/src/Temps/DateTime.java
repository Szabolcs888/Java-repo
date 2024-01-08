package Temps;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // 1970-től eltelt ezred milisecundomok
        LocalDate now = LocalDate.now();                // elkéri az aktuális dátumot a futás pillanatában
        System.out.println(now);

        System.out.println("---------1.----------");

        LocalDate firstDayOfThisYear = now.withDayOfYear(100); // az aktuális év 100-adik napjának dátuma
        System.out.println(firstDayOfThisYear);

        DayOfWeek dayOfWeek = firstDayOfThisYear.getDayOfWeek(); // lekérhető, hogy milyen napra esett a változóba mentett (a 100-ik) nap
        System.out.println(dayOfWeek);

        System.out.println("---------2.----------");

        System.out.println(now.plusDays(+365));  // napok hozzáadása, elvétele az adott dátumhoz
        System.out.println(now.plusMonths(3)); // hónapok hozzáadása, elvétele az adott dátumhoz
        System.out.println(now.plusYears(3));   // évek hozzáadása, elvétele az adott dátumhoz

        System.out.println("---------3.----------");

        LocalTime lunchStart = LocalTime.parse("12:00"); // konkrét idő elmentése egy változóba
        System.out.println(lunchStart);

        LocalDate birthDay = LocalDate.parse("1978-03-02"); // konkrét dátum elmentése egy változóba
        System.out.println(birthDay);
        DayOfWeek dayOfWeek2 = birthDay.getDayOfWeek(); // a változóba mentett dátum elmentése egy változóba
        System.out.println(dayOfWeek2);


        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);

     /*
        LocalDate birthdate = now.plusYears(-46).plusMonths(2).plusDays(-6) ;
        System.out.println("szülNap: "+birthdate);
        DayOfWeek dayOfWeek3 = birthdate.getDayOfWeek();
        System.out.println(dayOfWeek3);

      */

        System.out.println();
        // időzítés a Thread.sleep() metódussal, amit mindenképp Exception kezelnünk kell, mert pl. egy oldal tesztelésének automatizálásnál az oldal nem azonnal válaszol (be kell töltenie), így hiba keletkezne, ha nem várna program
        // System.out.println("Hello!");
        try {
            Thread.sleep(1000);
            System.out.println("Eltelt 5 másodperc!");
        } catch (Exception e) {
        }
    }
}
