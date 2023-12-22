package Exercises;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.io.FileInputStream;
import java.util.*;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) {
        String compChoice = "PAPÍR";
        String userChoice = "KŐ";
        game(compChoice, userChoice);

    }
    public static String game(String cCh, String uCh) {
        String roundWinner = "";
        if ((uCh.equals("KŐ")) && (cCh.equals("OLLÓ"))); {
            roundWinner = "userWinner";
        }


       return roundWinner;
        }

}

