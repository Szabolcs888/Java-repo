package Exercises;
        /* 1. Feladat
        Ha az állítás igaz, akkor értékadással, ha hamis,
        akkor értékadás nélkül hozom létre ugyanazon nevű változót.
        Ez azért lehetséges, mert különböző kapcsoszárójelek között
        (, azaz más-más scope-ban) vannak. */

public class F01_IfElseAndVar {
    public static void main(String[] args) {

        boolean variableInit = true;

        if (variableInit) {
            int variable = 21;
        } else {
            int variable;
        }


/* Ha az állítás igaz, akkor az adott változó értéke 21 lesz,
 ha hamis, akkor 34. Az eredmény kiírásra kerül.*/

        boolean variableInit2 = false;

        if (variableInit2) {
            int variable2 = 21;
            System.out.println(variable2);
        } else {
            int variable2 = 34;
            System.out.println(variable2);
        }
    }
}
