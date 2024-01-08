package JavaCore.task13;

public class MercedesPilotOne implements Car, Racer{
    private double acceleration;
    private String manufacturer;
    private String racerName;
    private String nationality;


    @Override
    public void acceleration(double second) {
acceleration= second;
    }

    @Override
    public void getCarManufacturer(String manufacturer) {

    }

    @Override
    public void getRacerName() {

    }

    @Override
    public String toString() {
        return "MercedesPilotOne{" +
                "acceleration=" + acceleration +
                ", manufacturer='" + manufacturer + '\'' +
                ", racerName='" + racerName + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    @Override
    public void getNationality() {

    }
}
