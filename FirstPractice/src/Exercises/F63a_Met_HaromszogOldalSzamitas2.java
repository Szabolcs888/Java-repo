package Exercises;

            /* 63.a Feladat (Órai) (Zsolt megoldása)
            A háromszög eldöntős programunk dolgozzuk át, hogy külön metódus legyen
            az oldal beolvasás ( getTriangleDataFromConsole() ), külön metódus a háromszög
            szerkeszthetősége ( isTriangeValid(aoldal,boldal,coldal) )és külön az eredmény
            String kiíratása ( showResultToTheUser(result) ). */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F63a_Met_HaromszogOldalSzamitas2 {
    public static void main(String[] args) {
    List<Integer> localData = getTriangleDataFromConsole();
        System.out.println(localData);

    boolean valid = isValidTriangle(localData);
        System.out.println(valid);

    //rövidebb hívás, ugyanazt csinálja mint az előző sorok
    //System.out.println(isValidTriangle(getTriangleDataFromConsole()));
}

    public static List<Integer> getTriangleDataFromConsole() {
        List<Integer> triangleData = new ArrayList<>();
        System.out.println("Give the triangle slide 'a' and press ENTER: ");
        Scanner scan = new Scanner(System.in);
        String userDataA = scan.next();

        System.out.println("Give the triangle slide 'b' and press ENTER: ");
        scan = new Scanner(System.in);
        String userDataB = scan.next();

        System.out.println("Give the triangle slide 'c' and press ENTER: ");
        scan = new Scanner(System.in);
        String userDataC = scan.next();

        triangleData.add(Integer.parseInt(userDataA));
        triangleData.add(Integer.parseInt(userDataB));
        triangleData.add(Integer.parseInt(userDataC));

        return triangleData;
    }

    public static boolean isValidTriangle(List<Integer> data) {
        if ((data.get(0) + data.get(1) > data.get(2)) &&
                (data.get(1) + data.get(2) > data.get(0)) &&
                (data.get(0) + data.get(2) > data.get(1))) {
            return true;
        } else {
            return false;
        }
    }
}