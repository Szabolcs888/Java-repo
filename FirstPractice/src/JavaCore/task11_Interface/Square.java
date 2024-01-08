package JavaCore.task11_Interface;

public class Square implements PolygonInterface {
    @Override
    public int getArea(int sideA, int sideB) {
        return sideA * sideA;
    }
}
