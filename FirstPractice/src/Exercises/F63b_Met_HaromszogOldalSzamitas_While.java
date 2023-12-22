package Exercises;

            /* 63.b Feladat (Órai) (saját megoldás)
            A háromszög eldöntős programunk dolgozzuk át, hogy külön metódus legyen
            az oldal beolvasás ( getTriangleDataFromConsole() ), külön metódus a háromszög
            szerkeszthetősége ( isTriangeValid(aoldal,boldal,coldal) )és külön az eredmény
            String kiíratása ( showResultToTheUser(result) ). Mindaddig ismételje a
            bekérést a felhasználótól, amíg nem ad neki helyes háromszög oldal adatokat. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F63b_Met_HaromszogOldalSzamitas_While {
    public static void main(String[] args) {

        boolean cycle = true;
        do {
            List<Integer> numList = getTriangleDataFromConsole();
            System.out.println(numList);

            boolean validOrInvalid = isTriangeValid(numList.get(0), numList.get(1), numList.get(2));
            showResultToTheUser(validOrInvalid);

            cycle = validOrInvalid;
        } while (!cycle);
    }

    public static List<Integer> getTriangleDataFromConsole() {
        List<Integer> triangleData = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the triangle slide a: ");
        triangleData.add(scan.nextInt());
        System.out.println("Give the triangle slide b: ");
        triangleData.add(scan.nextInt());
        System.out.println("Give the triangle slide c: ");
        triangleData.add(scan.nextInt());
        return triangleData;
    }

    public static boolean isTriangeValid(int a, int b, int c) {
        return a + b > c && a + c > b && c + b > a;
    }

    public static void showResultToTheUser(boolean result) {
        if (result)
            System.out.println("You are a lucky person.");
        else
            System.out.println("Please, try again.");
    }
}
