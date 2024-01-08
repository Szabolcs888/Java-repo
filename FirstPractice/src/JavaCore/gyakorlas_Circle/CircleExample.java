package JavaCore.gyakorlas_Circle;

public class CircleExample {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5);
        System.out.println("##############      Cirlce 1     ##################");
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("Area: " + circle1.getArea());

        Circle circle2 = circle1.scale(1.75);
        System.out.println("##############      Cirlce 2     ##################");
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println("Area: " + circle2.getArea());

        Circle guessWhatCirlce = circle2.scale(0.87).scale(3.21).scale(1.11);
        System.out.println("############## Guess What Cirlce ##################");
        System.out.println("Radius: " + guessWhatCirlce.getRadius());
        System.out.println("Perimeter: " + guessWhatCirlce.getPerimeter());
        System.out.println("Area: " + guessWhatCirlce.getArea());

        //circle2.getRad();

    }

}
