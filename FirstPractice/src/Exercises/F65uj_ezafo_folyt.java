package Exercises;

import java.util.Random;
import java.util.Scanner;

public class F65uj_ezafo_folyt {
    public static void main(String[] args) {
        // introduction();
        // rng();
        // compChoice();
        // userChoice();
        // game();

        int userPoints = 0;
        int compPoints = 0;

        introduction();
        int compRng = rng();
        System.out.println(compRng);
        String compChoice = compChMet(compRng);
        System.out.println("gép: " + compChoice);
        String userChoice = userChMet();
        System.out.println("te " + userChoice);
        String roundWinner = game(compChoice, userChoice);
        System.out.println(roundWinner);
    }

    public static void introduction() {
        System.out.println();
        System.out.println();
        System.out.println("                   Üdvözöllek a KŐ-PAPÍR-OLLÓ játékban!");
        System.out.println();
        System.out.println("A játék több fordulós. A győztes körök 3 pontot érnek, a döntetlen 1 - 1 pontot, kivéve");
        System.out.println(" minden harmadik kört, amelyek dupla pontot és minden hetedik kört, amelyek háromszoros");
        System.out.println("   pontot érnek. Az X lenyomásával bármelyik körben kiléphetsz. A tippedet megadhatod");
        System.out.println("              a 'k', vagy a 'p', vagy az 'o' billentyűk lenyomásával is.");
        System.out.println();
        //  System.out.println("Hány fordulóból álljon a játék?");
    }

    public static int rng() {
        Random rng = new Random();
        return rng.nextInt(1, 4);
    }

    public static String compChMet(int rngNum) {
        String compCh = "";
        switch (rngNum) {
            case 1:
                compCh = "KŐ";
                break;
            case 2:
                compCh = "PAPÍR";
                break;
            case 3:
                compCh = "OLLÓ";
        }
        return compCh;
    }

    public static String userChMet() {
        System.out.println();
        //   System.out.println(counter + ". forduló");
        System.out.println("Kérlek, válassz egyet: kő, papír vagy olló");
        Scanner scanString = new Scanner(System.in);
        String userCh = scanString.next().toUpperCase();

        if ((userCh.equals("K"))) {
            userCh = "KŐ";
        } else if ((userCh.equals("P"))) {
            userCh = "PAPÍR";
        } else if ((userCh.equals("O"))) {
            userCh = "OLLÓ";
        }
        while (!userCh.equals("KŐ") && !userCh.equals("PAPÍR") &&
                !userCh.equals("OLLÓ") && !userCh.equals("X")) {
            System.out.println();
            System.out.println("Kérlek, írj be helyes kifejezést!");
            userCh = scanString.next().toUpperCase();
            if ((userCh.equals("K"))) {
                userCh = "KŐ";
            } else if ((userCh.equals("P"))) {
                userCh = "PAPÍR";
            } else if ((userCh.equals("O"))) {
                userCh = "OLLÓ";
            }
            if (userCh.equals("X")) {
                break;
            }
        }
        return userCh;
    }

    public static String game(String cCh, String uCh) {
        if (((uCh.equals("KŐ")) && (cCh.equals("OLLÓ"))) ||
                ((uCh.equals("PAPÍR")) && (cCh.equals("KŐ"))) ||
                ((uCh.equals("OLLÓ")) && (cCh.equals("PAPÍR")))) {
            return "userWinner";
        } else if (uCh.equals(cCh)) {
            return "Draw";
        } else {
            return "computerWinner";
        }
    }
}


