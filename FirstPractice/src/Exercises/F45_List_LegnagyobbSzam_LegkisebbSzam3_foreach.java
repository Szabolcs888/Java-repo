package Exercises;

            /* 45 Feladat (Zsolt megoldása)
            Készítsünk egy elemzést a legutóbbi futásainkról. Az
            adatokat már kinyertük az aktivitás tracker-ünkből,
            az alábbi formában: Arrays.asList( 12.30, 12.45, 12.35,
            12.54, 12.53, 12.45, 12.61, 12.62, 12.73, 12.91, 12.90,
            12.72, 12.85, 12.90, 12.70, 12.58, 12.61, 12.67, 12.63,
            12.61, 12.74, 12.84, 12.99, 13.10, 13.21, 13.39, 13.23,
            13.09, 13.15, 13.00, 12.91, 12.85, 12.89, 13.00, 13.03,
            13.16, 13.25, 13.35, 13.36, 13.28, 13.42, 13.49, 13.36,
            13.32, 13.20, 13.23, 13.20, 13.02, 12.91, 12.74, 12.81,
            12.63, 12.79, 12.65, 12.59, 12.77, 12.77, 12.89, 12.76,
            12.76, 12.91, 12.90, 12.86, 12.89, 12.83, 12.67, 12.69,
            12.65, 12.73, 12.87);

            Ami a feladat, hogy írassuk ki a konzolra a listában
            található legnagyobb, legkisebb és átlagos sebességet. */

import java.util.Arrays;
import java.util.List;

public class F45_List_LegnagyobbSzam_LegkisebbSzam3_foreach {
    public static void main(String[] args) {
        //List<Double> executionTimes = new ArrayList<>();
        List<Double> executionTimes = Arrays.asList(12.30, 12.45, 12.35, 12.54, 12.53, 12.45, 12.61, 12.62, 12.73, 12.91, 12.90, 12.72, 12.85, 12.90, 12.70, 12.58, 12.61, 12.67, 12.63, 12.61, 12.74, 12.84, 12.99, 13.10, 13.21, 13.39, 13.23, 13.09, 13.15, 13.00, 12.91, 12.85, 12.89, 13.00, 13.03, 13.16, 13.25, 13.35, 13.36, 13.28, 13.42, 13.49, 13.36, 13.32, 13.20, 13.23, 13.20, 13.02, 12.91, 12.74, 12.81, 12.63, 12.79, 12.65, 12.59, 12.77, 12.77, 12.89, 12.76, 12.76, 12.91, 12.90, 12.86, 12.89, 12.83, 12.67, 12.69, 12.65, 12.73, 12.87);
        System.out.println(executionTimes);
        double sumExecutionTimes = 0.0;
        double largestExecutionTime = executionTimes.get(0);  //beállítjuk az első elemet ideiglenes maximumnak
        double smallestExecutionTime = executionTimes.get(0);  //beállítjuk az első elemet ideiglenes minimumnak

        for (double executionTime : executionTimes) {
            if (executionTime > largestExecutionTime) {
                largestExecutionTime = executionTime;
            }
            if(executionTime < smallestExecutionTime){
                smallestExecutionTime = executionTime;
            }
            sumExecutionTimes += executionTime;
        }

        //double longnumber = 24.34345454;
        //System.out.println(String.format("%.2f",longnumber)
        //System.out.println("AVG execution time: " + sumExecutionTimes / executionTimes.size());
        double avgExecutionTime = sumExecutionTimes / executionTimes.size();
        System.out.println("AVG execution time: " + String.format("%.2f", avgExecutionTime)); //megformázom 2 tizedesjegy pontosságig
        System.out.println("The largest execution time: " + largestExecutionTime);
        System.out.println("The smallest execution time: " + smallestExecutionTime);
    }
}


