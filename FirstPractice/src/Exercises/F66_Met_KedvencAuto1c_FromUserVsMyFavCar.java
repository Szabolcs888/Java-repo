package Exercises;

            /* 66. Feladat (saját megoldás)
            A 33.c feladat metódusítása */

import java.util.Scanner;

/*
        main();
            userTips();
            isIncludeMyFavCar;
            print();
 */

public class F66_Met_KedvencAuto1c_FromUserVsMyFavCar {
    public static void main(String[] args) {
        String[] userCarsArray = userTips();
        boolean isIncludeMyFavCarBoolean = isIncludeMyFavCar(userCarsArray);
        print(isIncludeMyFavCarBoolean);
    }

    public static String[] userTips() {
        Scanner scanString = new Scanner(System.in);
        String[] localUserCarsArray = new String[3];
        System.out.println("Kérlek, tippeld meg a kedvenc autómárkám! Három lehetőséged van:");
        System.out.println();
        for (int i = 0; i < localUserCarsArray.length; i++) {
            System.out.println(i + 1 + ". tipp:");
            localUserCarsArray[i] = scanString.nextLine().toLowerCase();
            if (localUserCarsArray[i].equals("x")) {
                i = localUserCarsArray.length;
            }
        }
        return localUserCarsArray;
    }

    public static boolean isIncludeMyFavCar(String[] localUserCarsArray) {
        boolean trueOrFalse =true;
        String myFavoriteCar = "opel";
        int yOn = 0;
        for (int i = 0; i < localUserCarsArray.length && !localUserCarsArray[i].equals("x"); i++) {
            if (localUserCarsArray[i].equals(myFavoriteCar)) {
                yOn += +1;
                break ;
            }
        }
         if (yOn == 0) {
             trueOrFalse = false;
         } return trueOrFalse;
    }

    public static void print(boolean LocalIsIncludeMyFavCarBoolean){
        if (LocalIsIncludeMyFavCarBoolean) {
            System.out.println();
            System.out.println("Eltaláltad, az Opel a kedvenc autóm.");
        } else {
            System.out.println();
            System.out.println("Nem találtad el, legközelebb több szerencséd lesz.");
        }
    }
}
