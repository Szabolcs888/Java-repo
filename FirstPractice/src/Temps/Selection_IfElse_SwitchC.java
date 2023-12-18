package Temps;

import java.util.Scanner;

public class Selection_IfElse_SwitchC {
    public static void main(String[] args) {
        System.out.println("Hello Selection examples");

        System.out.println();

        System.out.println("----------if----------");

        int carPrice = 1000;
        if (carPrice < 1111) {
            System.out.println("carPrice is less than 1111 eur");
        }

        System.out.println();


        System.out.println("----------if else----------");

        int motorPrice = 450;
        if (motorPrice < 400) {
            System.out.println("Hurray, I can buy the motor!");
        } else {
            System.out.println("There is no enough money. :(");
            System.out.println("Try to save more...");
        }

        System.out.println();


        System.out.println("----------if else if----------");

        int housePrice = 112000;
        if (110000 >= housePrice) {
            System.out.println("I buy it!");
        } else if (housePrice > 110000 && housePrice < 130000) { // ha ide is az kerülne, hogy: housePrice >= 110000 , akkor mivel megegyezik az első feltétellel, ezért az első hajtódik végre
            System.out.println("Could you give it to me for 110.000?");
        } else {
            System.out.println("Too expensive.");
            // Ha egyszerre két feltétel is igaz, akkor az első fut le, a második már nem kerül kiértékelésre.
        }

        System.out.println();


        System.out.println("----------switch case----------");

        System.out.println("Program started and wait for input as STRING: ");

        Scanner scan = new Scanner(System.in);
        String userData = scan.next();

        System.out.println();

        // switch-case
        // a case-break páros else if adatszerkezetként viselkedik, a default pedig else ágként
        // ez esetben mindkét példa ugyanazt az eredményt adja
        System.out.println("Stored data with switch-case: ");

        switch (userData) {
            case "Pista":
                System.out.println("Congrats, Pista is my bestie.");
                System.out.println("Hello");
                break;       // a break utasítás fontos, máskülönben végrehajtódik az utána következő utasítás is
            case "Józska":
                System.out.println("Congrats, Józska is my 2nd bestie.");
                break;
            default:
                System.out.println("No luck."); // default esetén nincs szükség break utasításra, mert az az utolsó a sorban
        }

        // ugyanez if-else -vel

        /*

        System.out.println("Stored data with if-else: ");

        if (userData.equals("Pista")) {
            System.out.println("Congrats, Pista is my bestie.");
        } else if (userData.equals("Józska")) {
            System.out.println("Congrats, Józska is my 2nd bestie.");
        } else {
            System.out.println("No luck.");
        }

       */
    }
}
