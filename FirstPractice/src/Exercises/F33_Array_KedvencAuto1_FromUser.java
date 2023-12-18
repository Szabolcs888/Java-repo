package Exercises;

            /* 33. Feladat (Órai) (saját megoldás)
            Készítsetek egy programot, amelyben egy tömbnek már a
            létrehozásakor definiáljuk az értékeket. A String típusú
            array neve legyen carsArray és állítsunk be neki legalább
            7db autómárkát. Hozzunk létre egy myFavoriteCar nevű String
            változót és állítsuk be az egyik, tömbhöz is hozzáadott
            autómárkát, mint kezdőérték. Egy ciklussal menjünk végig az
            elemeken, azaz járjuk be a tömböt. Ha az adott indexű tömb
            elem megegyezik a myFavoriteCar változó értékével akkor írjuk
            ki annak értékét a konzolra és fűzzük hozzá, hogy “ a kedvenc
            autómárkám.”

            A feladat annyiban módosul, hogy a usertől kérjünk be
            utómárkákat, és ha valamelyik egyezik, akkor kiíratjuk.

            Én annyival egészítettem még ki, hogy azt is kiíratjuk, ha
            nincs egyezés. */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class F33_Array_KedvencAuto1_FromUser {
    public static void main(String[] args) {

        String[] carsArray = {"AUDI", "BMV", "VOLKSWAGEN", "MERCEDES", "OPEL", "SEAT", "SUZUKI", "OPEL"};

        Scanner scanString = new Scanner(System.in);
        System.out.println("Kérlek, add meg a kedvenc autómárkád:");
        String userFavoriteCar = scanString.next().toUpperCase();

        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals(userFavoriteCar)) {
                System.out.println(carsArray[i] + " a kedvenc autód és szerepel a listán!");
                break;
            }
        }

        List<String> list = Arrays.asList(carsArray);
        if (list.contains(userFavoriteCar)) {
        } else {
            System.out.println(userFavoriteCar + " nem szerepel a listán.");
        }
    }
}



