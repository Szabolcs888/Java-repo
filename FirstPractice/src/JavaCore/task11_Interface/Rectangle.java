package JavaCore.task11_Interface;

public class Rectangle implements PolygonInterface {

    @Override
    public int getArea(int sideA, int sideB) {
        return sideA * sideB;
    }

}
