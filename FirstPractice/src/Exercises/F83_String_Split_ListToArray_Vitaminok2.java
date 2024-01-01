package Exercises;

            /* 83. Feladat (Órai) (Zsolt megoldása)
            Egy jövőbeli társadalomban az emberek vitaminfogyasztását pontosan jegyzik.
            A vitaminok közül a C, D és E vitaminok naponta bevitt mennyiségét gyűjtik
            egy ArrayList-be. Ebben a társadalomban a napi ajánlott mennyiség C
            vitaminból 500 mg, D vitaminból 800 NE (nemzetközi egység), E vitaminból
            pedig 1000 mg. A feladat, hogy dolgozzuk fel a lenti listát, figyelmeztetést
            adva azokról a személyekről, akik nem fogyasztottak elegendő vitamint.
            Írjuk ki a személyek nevét és a vitamin nevét, amiből nem fogyasztottak
            elegendő mennyiséget, a fogyasztott mennyiséggel együtt.
            List<String> vitaminConsumptions = Arrays.asList(
            "Name:Scarlett-6fccbdca,C:50,D:600,E:3000",
            "Name:Scarlett-c52ec32f,C:350,D:2000,E:4000",
            "Name:Bob-600b03a6,C:150,D:2000,E:2200",);
            Tehát egy példa kiíratás: Hey Bob-a4e7e3f7! Your C-vitamin consumption
            is too low! */

import java.util.Arrays;
import java.util.List;

public class F83_String_Split_ListToArray_Vitaminok2 {
    public static void main(String[] args) {
        int requiredVitaminC = 500;
        int requiredVitaminD = 800;
        int requiredVitaminE = 100;
        List<String> vitaminConsumptions = Arrays.asList(
                "Name:Scarlett-6fccbdca,C:50,D:600,E:3000",
                "Name:Scarlett-c52ec32f,C:350,D:2000,E:4000",
                "Name:Bob-600b03a6,C:150,D:2000,E:2200",
                "Name:Scarlett-38d7e3a2,C:150,D:1000,E:100",
                "Name:Scarlett-3abde882,C:950,D:1200,E:300",
                "Name:Scarlett-76b92994,C:900,D:1600,E:4000",
                "Name:Bob-2b4a1544,C:600,D:800,E:1800",
                "Name:Bob-2421990a,C:50,D:200,E:1200",
                "Name:Bob-dd9be590,C:800,D:1200,E:600",
                "Name:Bob-4e0104b2,C:850,D:1000,E:2400",
                "Name:Bob-d63cb4ae,C:300,D:1800,E:200",
                "Name:Scarlett-294ece9c,C:100,D:1600,E:3100",
                "Name:Bob-a2a8b3d4,C:300,D:1200,E:1000",
                "Name:Bob-b87ae9dc,C:800,D:2000,E:2500",
                "Name:Scarlett-8e174152,C:350,D:200,E:3800",
                "Name:Scarlett-ec5a81be,C:450,D:1600,E:3700",
                "Name:Scarlett-ef7b71b9,C:50,D:400,E:1500",
                "Name:Scarlett-97856f0d,C:1000,D:1200,E:2000",
                "Name:Bob-2883e779,C:950,D:800,E:4000",
                "Name:Scarlett-abcc50bc,C:550,D:600,E:2800",
                "Name:Scarlett-28af295b,C:650,D:800,E:500",
                "Name:Bob-3d58e4c1,C:700,D:800,E:1700",
                "Name:Bob-0b8301b7,C:150,D:1400,E:1000",
                "Name:Bob-4041df3e,C:900,D:1800,E:1700",
                "Name:Scarlett-3e15502a,C:450,D:600,E:2200",
                "Name:Scarlett-1fae31bc,C:950,D:800,E:1800",
                "Name:Bob-47126df2,C:1000,D:1000,E:1900",
                "Name:Scarlett-63167044,C:550,D:1400,E:1600",
                "Name:Scarlett-ea01d4c2,C:800,D:800,E:3000",
                "Name:Scarlett-1c0c8bd5,C:1000,D:800,E:4000",
                "Name:Scarlett-af993b7d,C:800,D:1400,E:500",
                "Name:Scarlett-dc49a3f7,C:500,D:800,E:1200",
                "Name:Bob-2c2d260b,C:600,D:1200,E:2600",
                "Name:Bob-a4e7e3f7,C:150,D:1800,E:3600",
                "Name:Scarlett-991f6f64,C:750,D:2000,E:4000"
        );

        for (String personDailyVitamins : vitaminConsumptions) {
            //personDailyVitamins = "Name:Scarlett-991f6f64,C:750,D:2000,E:4000"
            String[] data = personDailyVitamins.split(","); //["Name:Scarlett-991f6f64","C:750","D:2000","E:4000"]
            String[] nameData = data[0].split(":"); //["Name","Scarlett-991f6f64"]
            String[] vitaminCData = data[1].split(":"); //["C","750"]
            String[] vitaminDData = data[2].split(":"); //["D","2000"]
            String[] vitaminEData = data[3].split(":"); //["E","4000"]

            //int vitaminCValue = Integer.parseInt(data[1].split(":")[1]);
            int vitaminCValue = Integer.parseInt(vitaminCData[1]);
            int vitaminDValue = Integer.parseInt(vitaminDData[1]);
            int vitaminEValue = Integer.parseInt(vitaminEData[1]);

            String resultToConsole = "";
            if (requiredVitaminC > vitaminCValue) {
                resultToConsole += vitaminCData[0] + " ";
            }

            if (requiredVitaminD > vitaminDValue) {
                resultToConsole += vitaminDData[0] + " ";
            }

            if (requiredVitaminE > vitaminEValue) {
                resultToConsole += vitaminEData[0] + " ";
            }

            if (!resultToConsole.equals(""))
                System.out.println(nameData[1] + ". You are low in Vitamin " + resultToConsole + ".");
        }
    }
}
