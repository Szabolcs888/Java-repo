package JavaCore.task03;

public class task03 {
    public static void main(String[] args) {
        Donut classicDonut = new Donut("circle", 10, "chocolate", "flour", "pink");
        Donut testDonut = new Donut("rectangle", 5);
        Donut hunCsoroge = new Donut("circle", 3, "vanile");

        System.out.println(classicDonut);
        classicDonut.setShape("square");
        System.out.println(classicDonut);

        System.out.println(testDonut);

        System.out.println(hunCsoroge);
    }
}
