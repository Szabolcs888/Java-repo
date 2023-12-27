package Exercises;

            /* 33.a Feladat (Órai) (saját megoldás)
            Készítsetek egy programot, amelyben egy tömbnek már a
            létrehozásakor definiáljuk az értékeket. A String típusú
            array neve legyen carsArray és állítsunk be neki legalább
            7db autómárkát. Hozzunk létre egy myFavoriteCar nevű String
            változót és állítsuk be az egyik, tömbhöz is hozzáadott
            autómárkát, mint kezdőérték. Egy ciklussal menjünk végig az
            elemeken, azaz járjuk be a tömböt. Ha az adott indexű tömb
            elem megegyezik a myFavoriteCar változó értékével akkor írjuk
            ki annak értékét a konzolra és fűzzük hozzá, hogy “ a kedvenc
            autómárkám.” */

public class F33a_Array_KedvencAuto1_Boolean {
    public static void main(String[] args) {


        String[] carsArray = {"Audi ", "BMV", "Volkswagen", "Mercedes", "Opel", "Seat", "Suzuki", "Opel"}; // az utolsó Opel azért lett beletéve, hogy megmutatkozzon a break utasítás eredménye is - azaz, hiába szerepel többször a keresendő elem, a break-nek köszönhetően az első találat után befejeződik a tömb átnézése
        String myFavoriteCar = "Opel";

        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals(myFavoriteCar)) {
                System.out.println(carsArray[i] + " a kedvenc autóm!");
                break;
            }
        }
        System.out.println();

        // Zsolt kiegészítése; tömb elemeinek összehasonlítása boolean-val
        for (int i = 0; i < carsArray.length; i++) {
            System.out.print(carsArray[i].equals(myFavoriteCar) + " ");
        }
    }
}
