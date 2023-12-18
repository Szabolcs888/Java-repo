package Exercises;

/*
86)	Kérjünk el egy stringet a felhasználótól és írjuk ki a 10. karakterét. Kezeljük le a keletkező exceptiont.
 */


import java.util.Scanner;

public class F86 {
    public static void main(String[] args) {

            System.out.println(getStringFromConsole());


        }
        public static String getStringFromConsole() {
            String userScan = "";

            try {
                Scanner scan = new Scanner(System.in);
                userScan = scan.next();
                System.out.println(userScan.charAt(3));

            } catch (Exception e) {
                System.out.println();
                System.out.println("Túl rövid a szöveg!");
            }
            return userScan;
        }
    }



