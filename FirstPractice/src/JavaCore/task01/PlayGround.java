package JavaCore.task01;

public class PlayGround {
    public static void main(String[] args) {
        Car ferrari = new Car();
        Car opel = new Car();
        Car fiat = new Car();
        Car honda = new Car();
        Car audi = new Car();



       // ferrari.color = "piros";
       // ferrari.model = "Testarosa";
       // opel.color = "gray";
       // opel.model = "Astra";

        ferrari.setModel("Gt 1000");
        ferrari.setColor("blue");
        opel.setModel("H");
        opel.setColor("gray");
       // System.out.println(ferrari.color);
        System.out.println(ferrari.getValues());
       // System.out.println(opel.color);
        System.out.println(opel.getValues());
       // System.out.println(ferrari.getModel());

    }
}
