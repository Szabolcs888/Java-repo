package JavaCore.task000;

public class CarExampleMain {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "black", "fast");
        System.out.println("Model: " + audi.getModel());
        System.out.println("Colour: " + audi.getColour());
        System.out.println("Speed: " + audi.getSpeed());

        System.out.println();

        Car bmw = new Car("BMW", "blue", "halfFast");
        System.out.println("Model: " + bmw.getModel());
        System.out.println("Colour: " + bmw.getColour());
        System.out.println("Speed: " + bmw.getSpeed());

        System.out.println();

        Car ferrari = new Car("Ferrari", "red", "very fast");
        ferrari.setColour("green");

        System.out.println("Model: " + ferrari.getModel());
        System.out.println("Colour: " + ferrari.getColour());
        System.out.println("Speed: " + ferrari.getSpeed());

    }
}
