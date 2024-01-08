package JavaCore.task11_Interface;
/*
11.	Készíts egy interfészt, PolygonInterface néven. Tartalmazzon egy metódust
 getArea néven, melynek a visszatérési értéke int, illetve van két int típusú
 paramétere, amely a sokszög két oldala.
a.	Implementáld az interfészt egy téglalap osztály, Rectangle segítségével.
Készíts el minden segéd változót, kontruktort, getter settert, toString-et ami
 esetleg szükséges. Készíts egy PolygonRunner osztályt, ahonnan ki tudod próbálni
  a téglalap osztály példányosítását és terület számítását.
b.	Készítsd el a téglalap osztályhoz hasonlóan a négyzet osztályt, Square néven és
 próbáld ki azt is a PolygonRunner-ből.

 */
public class PoligonMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        int area = rectangle1.getArea(2,3);

        System.out.println(area);

        Square square1 = new Square();
        area = square1.getArea(3,3);
        System.out.println(area);
    }
}
