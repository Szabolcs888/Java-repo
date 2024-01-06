package JavaCore.Task05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        String nev = readFromUser("Please enter your name: ");
        String email = readFromUser("Please enter your e-mail address: ");
        int szuletesi_Datum = readFromUserInt("Please enter your birth date: ");
        int telefonszam = readFromUserInt("Please enter your phone number: ");
        String munkahely = readFromUser("Please enter your workplace: ");

        User user1 = new User(email, nev, szuletesi_Datum);

        if (email.isEmpty() || nev.isEmpty())
        System.out.println("A név és az email megadása kötelező!");

       // if (telefonszam <0 )
            user1.setTelefonszam(telefonszam);

      //  if (munkahely.isEmpty())
           user1.setMunkahely(munkahely);

        System.out.println(nev + ": " + user1);
        System.out.println(user1.toString());
    }

    public static String readFromUser(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        return scan.nextLine();
    }

    public static int readFromUserInt(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        return scan.nextInt();
    }

}
