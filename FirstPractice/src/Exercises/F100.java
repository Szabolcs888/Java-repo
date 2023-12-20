package Exercises;

/*
100)	Készítsetek összesítő alkalmazást, ami megszámolja hogy az adott nap hányszor
 volt valamilyen rendszerleállás az egyik microservice kapcsán. Az adott napi leállásokat
  sikerült a monitoring alkalmazásból kinyerni és egy listába elmenteni a napra vonatkozóan:
  List<String> logs = Arrays.asList(
    "07:17", "07:04", "07:48", "07:36", "07:52",
    "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
    "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
    "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
    "07:54", "07:04", "17:13", "17:07", "18:55", "07:14", "07:48",
    "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41"
);
Az összleállás mellett, fontos hogy mennyi leállás volt délelőtt (12:00) és mennyi délután.

 */


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F100 {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "07:17", "07:04", "07:48", "07:36", "07:52",
                "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
                "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
                "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
                "07:54", "07:04", "17:13", "17:07", "18:55", "07:14", "07:48",
                "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41");

        List<LocalTime> logsServerStops = new ArrayList<>();
        for (String log : logs) {
            LocalTime time = LocalTime.parse(log);
            logsServerStops.add(time);
        }
        int countTimeBefore12 = 0, countTimeLate12 = 0;
        for (LocalTime log : logsServerStops) {
            if (log.getHour() < 12) {
                countTimeBefore12++;
            } else
                countTimeLate12++;
        }
        System.out.println("Össz leállások száma: " + logsServerStops.size());
        System.out.println("Leállások száma 12 óra előtt: " + countTimeBefore12);
        System.out.println("Leállások száma 12 óra után: " + countTimeLate12);
    }
}
