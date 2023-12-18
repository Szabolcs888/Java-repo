package Exercises;

            /* 42.a Feladat (saját megoldás)
            Írjatok programot, amely a megadott testhőmérsékleti adatokból,
            amit a felhasználó rögzített, a listában tárolást követően
            kiszámolja mennyi volt az átlagos testhő. Az adatokat az utolsó
            3 nap, napi 3 (reggeli, napközbeni és esti) adataival kell mindig
            rögzíteni, tehát mindig fix 9 testhőmérsékleti adatot. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F42a_List_HomeroAtlagertek {
    public static void main(String[] args) {

        List<Float> temperatureList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        float sum = 0;
        float userScan = 0;

        System.out.println();
        System.out.println("Kérlek, add meg a mérési eredményeket!");
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            System.out.println(i + ". mérés:");
            userScan = scan.nextFloat();
            if (userScan < 44 && userScan > 35){
                temperatureList.add(userScan);
            }else {
                System.out.println("Kérlek, helyes értéket adj meg!");
                i--;
            }
        }
        for (float item : temperatureList) {
            sum += item; //sum = sum + bill;
        }

        System.out.println();
        System.out.print("Az eredmények: " + temperatureList + " ");
        System.out.println();
        System.out.println("Az átlaghőmérséklet: " + sum / temperatureList.size());
    }
}
