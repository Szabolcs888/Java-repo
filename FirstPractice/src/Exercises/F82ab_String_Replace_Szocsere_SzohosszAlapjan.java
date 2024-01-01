package Exercises;

            /* 82.a-b Feladat (saját megoldás)
            Írjatok családbarát metódust, amely egy, a metódusban előre létrehozott
            listában tárolt szavakat megkeres egyesével a paraméterként kapott szövegben.
            Amennyiben megtalálja, cserélje ezeket “*” karakterekre. A csillagozott rész
            legyen pont annyi karakter, amennyi az eredeti szó volt.

            A replace végrehajtódik if nélkül is! Az if-re csak a *-ok növelése miatt van
            szükség! */

import java.util.Arrays;
import java.util.List;

public class F82ab_String_Replace_Szocsere_SzohosszAlapjan {
    public static void main(String[] args) {
        List<String> ignoreWords = Arrays.asList("francba", "kutyafáját", "terembúráját");
        String text = "Ez már hihetetlen, a terembúráját neki. Menjetek a francba! A kutyafáját neki!";
        wordChange(text, ignoreWords);
    }

    private static void wordChange(String text, List<String> ignoreWords) {

        for (int i = 0; i < ignoreWords.size(); i++) {
            if (text.contains(ignoreWords.get(i))) {
                String changedString = "";
                for (int symbolCounter = 0; symbolCounter < ignoreWords.get(i).length(); symbolCounter++) {
                    changedString = changedString + "*";
                }
                text = text.replace(ignoreWords.get(i), changedString);
            }
        }
        System.out.println(text);
    }
}
