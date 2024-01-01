package Exercises;

            /* 82.a-b Feladat (Zsolt megoldása)
            Írjatok családbarát metódust, amely egy, a metódusban előre létrehozott
            listában tárolt szavakat megkeres egyesével a paraméterként kapott szövegben.
            Amennyiben megtalálja, cserélje ezeket “*” karakterekre. A csillagozott rész
            legyen pont annyi karakter, amennyi az eredeti szó volt. */

import java.util.Arrays;
import java.util.List;

public class F82ab_String_Replace_Szocsere_SzohosszAlapjan2 {
    public static void main(String[] args) {
        replaceWords("Elmentem abba a kaki boltba és útközben találkoztam azzal a fütyi bácsival.");

    }

    public static void replaceWords(String text) {
        List<String> blacklist = Arrays.asList("kaki", "pisi", "fütyi");
        for (String dirtyword : blacklist) {
            int dirtyWordLength = dirtyword.length(); //4 első iterációban
            String maskText = "";
            for (int cycleVar = 0; cycleVar < dirtyWordLength; cycleVar++) {  //while(maskText.length() != dirtyWordLength ){
                maskText +=  "*";
            }
            text = text.replace(dirtyword, maskText);
            System.out.println(text);
        }
    }
}
