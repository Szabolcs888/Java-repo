package JavaCore.task13;
/*
13.	Készítsetek egy interfészt Car néven, melyben szerepel
 egy acceleration metódus, a gyorsulás reprezentálására,
  mely vár egy double típusú értéket, hogy mennyi idő
   alatt tud 0-ról 100-ra felgyorsulni, valamint egy
    getCarManufacturer metódus a kocsi gyártójának elkérésére.
     Készüljön el egy másik interfész is, Racer néven.
      Legyen neki egy getRacerName és egy getNationality
       metódusa a neve és nemzetisége elkérésére.
a.	Készítsetek egy osztályt MercedesPilotOne néven, amely
 implementálja mindkét interfészt. Töltsétek meg tartalommal
  és hiányzó elemekkel az osztályt és példányosítsátok azt
   a FormulaOneRunner osztályban.
b.	Készítsetek egy osztályt FerrariPilotOne néven,  amely
 implementálja mindkét interfészt. Töltsétek meg tartalommal
  és hiányzó elemekkel az osztályt és példányosítsátok azt a
  FormulaOneRunner osztályban.

 */
public interface Car {
    void acceleration(double acceleration);
    void getCarManufacturer(String manufacturer);
}
