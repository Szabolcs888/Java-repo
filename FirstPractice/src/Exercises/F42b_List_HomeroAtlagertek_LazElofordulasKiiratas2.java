package Exercises;

            /* 42.b Feladat (Zsolt megoldása)
            Írjatok programot, amely a megadott testhőmérsékleti adatokból,
            amit a felhasználó rögzített, a listában tárolást követően
            kiszámolja mennyi volt az átlagos testhő. Az adatokat az utolsó
            3 nap, napi 3 (reggeli, napközbeni és esti) adataival kell mindig
            rögzíteni, tehát mindig fix 9 testhőmérsékleti adatot. Ill. számoljuk
            ki, hogy hányszor volt lázas a bevitt adatok alapján a delikvens. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F42b_List_HomeroAtlagertek_LazElofordulasKiiratas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Float> temperatures = new ArrayList<>();
        //String bevitt adatok esetén át kell alakítani float típusú értékké
        //String temp = scanner.nextLine();
        //float tempAsFLoat = Float.parseFloat(temp);

        float sumTemp = 0;
        int countTemp = 9;
        while (countTemp > 0) {
            System.out.println("Add a temperature: ");
            float t = scanner.nextFloat();
            if (t > 36.0 && t < 43.0) {
                temperatures.add(t);
                countTemp--;
            }
        }

        int countFever = 0;
        for (float temp : temperatures) {
            if (temp > 38) {
                countFever++;
            }
            sumTemp += temp;
        }

        System.out.println(temperatures);
        System.out.println("Sum of temps: " + sumTemp);
        System.out.println("AVG temperature: " + sumTemp / temperatures.size());
        System.out.println("Count of fever: " + countFever);
    }
}
