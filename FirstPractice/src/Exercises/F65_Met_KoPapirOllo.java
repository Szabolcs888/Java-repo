package Exercises;

            /* 65. Feladat (Órai) (saját megoldás)
            A 17.d Kő-papír olló metódusítása */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
        main();
            introduction();
            game();
                userCounter();
                compChoice();
                userChoice();
                winOfRound();
                scoreSum();
                scorePrint();
                endOfGameScorePrint();
 */

public class F65_Met_KoPapirOllo {
    public static void main(String[] args) {
        introduction();
        game();
    }

    public static void introduction() {
        System.out.println(System.lineSeparator() + System.lineSeparator() + "                         Üdvözöllek a KŐ-PAPÍR-OLLÓ játékban!"
                + System.lineSeparator() + System.lineSeparator() + "A játék több fordulós. A győztes körök 3 pontot érnek, a döntetlen 1 - 1 pontot, kivéve"
                + System.lineSeparator() + " minden harmadik kört, amelyek dupla pontot és minden hetedik kört, amelyek háromszoros"
                + System.lineSeparator() + "   pontot érnek. Az X lenyomásával bármelyik körben kiléphetsz. A tippedet megadhatod"
                + System.lineSeparator() + "              a 'k', vagy a 'p', vagy az 'o' billentyűk lenyomásával is."
                + System.lineSeparator() + System.lineSeparator() + "Hány fordulóból álljon a játék?");
    }

    public static void game() {
        int userCounter = fromUserCounter();
        int roundCounter = 1;
        int userPoints = 0;
        int compPoints = 0;
        String userChX = "";
        List<Integer> scoreList = new ArrayList<>();
        do {
            String compChoice = compChMet();
            String userChoice = userChMet(roundCounter);
            String roundWinner = winOfRound(compChoice, userChoice);
            userChX = userChoice;
            if (!userChoice.equals("X")) {
                scoreList = scoreSum(roundCounter, compChoice, userChoice, roundWinner);
                userPoints += scoreList.get(0);
                compPoints += scoreList.get(1);
                scorePrint(userPoints, compPoints);
                roundCounter++;
            }
        } while (roundCounter <= userCounter && !userChX.equals("X"));
        endOfGameScorePrint(userPoints, compPoints);
    }

    public static int fromUserCounter() {
        int scanUserCounter = 0;
        do {
            try {
                Scanner scanString = new Scanner(System.in);
                scanUserCounter = scanString.nextInt();
                if (scanUserCounter <= 0) {
                    System.err.println(System.lineSeparator() + "Egynél nem lehet kevesebb kör, nagyobb számot adj meg, kérlek! ");
                }
            } catch (Exception e) {
                System.err.println(System.lineSeparator() + "Számot adj meg, kérlek!");
            }
        } while (scanUserCounter <= 0);
        System.out.println(System.lineSeparator() + "A játék " + scanUserCounter + " fordulós lesz. Sok szerencsét!");
        return scanUserCounter;
    }

    public static String compChMet() {
        Random rng = new Random();
        int rngNum = rng.nextInt(1, 4);
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

    public static String userChMet(int count) {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        System.out.println(System.lineSeparator() + System.lineSeparator() + count + ". forduló");
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
            System.err.println(System.lineSeparator() + "Kérlek, írj be helyes kifejezést!");
            userCh = scanString.next().toUpperCase();
            if ((userCh.equals("K"))) {
                userCh = "KŐ";
                return userCh;
            } else if ((userCh.equals("P"))) {
                userCh = "PAPÍR";
                return userCh;
            } else if ((userCh.equals("O"))) {
                userCh = "OLLÓ";
                return userCh;
            }
        }
        return userCh;
    }

    public static String winOfRound(String cCh, String uCh) {
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

    public static List<Integer> scoreSum(int count, String compCh, String userCh, String winner) {
        int userPoints = 0;
        int compPoints = 0;
        List<Integer> countWinList = new ArrayList<>();
        System.out.println(System.lineSeparator() + "A te választásod: " + userCh);
        System.out.println("A gép választása: " + compCh + System.lineSeparator());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        if (winner.equals("userWinner")) {
            System.out.println("A " + count + ". fordulót te nyerted.");
            if (count % 3 == 0) {
                userPoints = userPoints + 3 * 2;
            } else if (count % 7 == 0) {
                userPoints = userPoints + 3 * 3;
            } else {
                userPoints = userPoints + 3;
            }
        } else if (winner.equals("computerWinner")) {
            System.out.println("A " + count + ". fordulót a gép nyerte.");
            if (count % 3 == 0) {
                compPoints = compPoints + 3 * 2;
            } else if (count % 7 == 0) {
                compPoints = compPoints + 3 * 3;
            } else {
                compPoints = compPoints + 3;
            }
        } else {
            System.out.println("A " + count + ". forduló döntetlen lett.");
            if (count % 3 == 0) {
                userPoints = userPoints + 2;
                compPoints = compPoints + 2;
            } else if (count % 7 == 0) {
                userPoints = userPoints + 3;
                compPoints = compPoints + 3;
            } else {
                userPoints++;
                compPoints++;
            }
        }
        countWinList.add(userPoints);
        countWinList.add(compPoints);
        return countWinList;
    }

    public static void scorePrint(int userSc, int compSc) {
        System.out.println(System.lineSeparator() + "A játékos pontjainak száma: " + userSc);
        System.out.println("A gép pontjainak száma: " + compSc);
    }

    public static void endOfGameScorePrint(int userScSum, int compScSum) {
        System.out.println(System.lineSeparator() + "A játék végetért." + System.lineSeparator());
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        if (userScSum > compScSum) {
            System.out.println("Gratulálok, te nyertél " + userScSum + " : " + compScSum + " arányban!");
        } else if (userScSum < compScSum) {
            System.out.println("A gép nyert " + compScSum + " : " + userScSum + " arányban! Legközelebb több szerencséd lesz.");
        } else {
            System.out.println("A végeredmény döntetlen lett. Te és a gép is " + userScSum + " - " + compScSum + " pontot szereztetek.");
        }
    }
}


