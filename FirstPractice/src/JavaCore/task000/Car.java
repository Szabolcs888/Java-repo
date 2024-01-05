package JavaCore.task000;

public class Car {

    // összefog néhány leíró adatot egy autóra vonatkozóan
    // (ezek lesznek az osztályváltozók, vagy más néven field-ek),
    // fields
    private String model;
    private String colour;
    private String speed;

    // van neki konstruktora, amit arra tudunk használni, hogy az
    // osztályból (mint tervrajzból) létrehozzunk egy példányt, objektumot,
    // és az a konstruktorok feladata, hogy az adott objektum állapotát, tulajdonságait beállítsa.
    // A this kulcsszó azt jelenti, hogy a jelenlegi objektumnak, amit ebből az osztályból hoztunk
    // létre, szeretnénk beállítani az egyik adatát.
    // ha azt a kifejezést nézzük, hogy this.model, akkor a konstruktor által létrejövő objektum model
    // osztályváltozójáról beszélünk, ha pedig a = name részt, akkor a konstruktor argumentuma által
    // bejövő adatról.

    // constructor
    public Car(String model, String colour, String speed) {
        this.model = model;
        this.colour = colour;
        this.speed = speed;
    }

    // és készítünk neki néhány metódust, amivel a belső adatait érhetjük el,
    // esetleg módosíthatjuk azt, ezeket hívjuk getter és setter metódusoknak.
    // getters, setters
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}


