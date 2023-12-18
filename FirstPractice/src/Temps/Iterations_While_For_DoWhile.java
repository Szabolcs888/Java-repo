package Temps;

public class Iterations_While_For_DoWhile {
    public static void main(String[] args) {

        //----------while----------

        System.out.println();

        System.out.println("----------while----------");

        /*

        while (feltétel) {
             utastás1;
	           ...
             utasításn;
        };

        */

        int iterator = 0;
        while (iterator < 4) {
            System.out.println("Hello with while");
            iterator++;
        }


        System.out.println();

        //----------for----------

        System.out.println("----------for----------");

        /*

        for (inicializálás; feltétel; növekmény) {
            utastás1;
             ...
            utasításn;
        } ;

        */

        // a for példák ugyanazt eredményezik, mint a while példa

        for (int cycleVar = 0; cycleVar <= 3; cycleVar++) {
            System.out.println("Hello with for");
        }

        System.out.println();

        for (int cycleVar = 3; cycleVar >= 0; cycleVar--) {
            System.out.println("Hello with for");
        }

        System.out.println();

        for (int cycleVar = 6; cycleVar >= 0; cycleVar -= 2) {
            System.out.println("Hello with for");
        }


        System.out.println();

        //----------do while----------

        System.out.println("----------do while----------");

        /*

        do {
            utastás1;
	           ...
            utasításn;
        } while (feltétel);

         */

        // pl. beolvasásnál egyszerűbb lehet a do while használata

        int iteratoR = 0;
        do {
            System.out.println("Hello with do while");
            iteratoR++;
        } while (iteratoR < 4);

        System.out.println();

        // Egyszer akkor is végrehajtódik az utasítás, ha a feltétel nem teljesül.

        int iteratoRr = 0;
        do {
            System.out.println("Hello with do while");
            iteratoRr++;
        } while (iteratoRr < -1);


        System.out.println();

        //----------for each----------

        System.out.println("----------for each----------");

        /*

        for (datatype változó : objektum) {
            utastás1;
	          ...
            utasításn;
        } ;

         */

        // tömb tartalmának kiíratása for each-vel

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int item : numbers)
            System.out.println("Count is: " + item);

        System.out.println();

        // pontosan ugyanaz történik, mint for-val:

        for (int i = 0; i < numbers.length; i++)
            System.out.println("Count is: " + numbers[i]);
    }
}








