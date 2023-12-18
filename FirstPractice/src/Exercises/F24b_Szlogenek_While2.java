package Exercises;

import java.util.Scanner;

         /* 24.b Feladat (Zsolt megoldása)
         Készítsetek szlogen automatát, amely a felhasználó által beolvasott
         márkára visszaadja a felhasználónak az adott márka szlogenjét.
         Switch-case adatszerkezettel oldjátok meg. És induljon újra automatikusan
         a program mindaddig, amíg a márka helyett “exit”-et nem ír a felhasználó */

public class F24b_Szlogenek_While2 {
    public static void main(String[] args) {

        System.out.println("Are you curious for a slogen? Give me the brand and I will tell it to you:");
        Scanner scanner = new Scanner(System.in);
        String brand;
        do {
            brand = scanner.next();
            if (!brand.equals("exit")) {
                switch (brand) {
                    case "Nike":
                        System.out.println("Just Do It");
                        break;
                    case "Apple":
                        System.out.println("Think different");
                        break;
                    case "Volkswagen":
                        System.out.println("Das auto");
                        break;
                    case "Redbull":
                        System.out.println("A Red Bull szárnyakat ad");
                        break;
                    case "McDonald's":
                        System.out.println("I'm Lovin' It");
                        break;
                    default:
                        System.out.println("Unknown brand. Please try to give a new one.");
                }
            }
        } while (!brand.equals("exit"));

       /*

        String brand = "";
        while (!brand.equals("exit")){
            brand = scanner.next();
            switch (brand) {
                case "Nike":
                    System.out.println("Just Do It");
                    break;
                case "Apple":
                    System.out.println("Think different");
                    break;
                case "Volkswagen":
                    System.out.println("Das auto");
                    break;
                case "Redbull":
                    System.out.println("A Red Bull szárnyakat ad");
                    break;
                case "McDonald's":
                    System.out.println("I'm Lovin' It");
                    break;
                default:
                    System.out.println("Unknown brand. Please try to give a new one.");
            }
        }

        */
    }
}