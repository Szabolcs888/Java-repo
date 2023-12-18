package Exercises;

            /* 33. Feladat (Órai) (Zsolt megoldása)
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

public class F33_Array_KedvencAuto2 {
    public static void main(String[] args) {

        String[] carsArray = {"Mercedes", "Kia", "Ferrari", "Alfa Romeo", "Ferrari"};
        String myFavoriteCar = "Ferrari";

        //ciklus kezdete
        //HA carsArray indexen lévő eleme megegyezik myFavoriteCar-al, akkor sout
        //ciklus vége
        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals(myFavoriteCar)) {
                System.out.println(carsArray[i] + " a kedvenc autómárkám.");
                //break az opcionális, optimalizálás miatt berakható, hogy ne nézze a tömb többi elemét, ha már megtalálta az egyezőt
                break;
            }
        }

        /* ugyanaz mint ez, csak nem annyira szép
        for (int i = 0; i < carsArray.length; i++) {
            switch (carsArray[i]){
                case "Ferrari":
                    System.out.println(carsArray[i] + " a kedvenc autómárkám.");
                    i=carsArray.length;
                    break;
            }
        }
        */
    }
}

