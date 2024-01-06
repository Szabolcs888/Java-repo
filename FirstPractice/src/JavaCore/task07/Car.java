package JavaCore.task07;

public class Car {
    private String manufacturer;
    private String model;
    private String color;
    private int passengerCount;
    private boolean selfdrive;

    public void acceleration(){
        System.out.println("The car accelerated.");
    }
    public void stop(){
        System.out.println("The car is stopped.");
    }

    public void horn(){
        System.out.println("The car is horn used.");
    }

    public void indicate(){
        System.out.println("The car is indicated.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public boolean isSelfdrive() {
        return selfdrive;
    }

    public void setSelfdrive(boolean selfdrive) {
        this.selfdrive = selfdrive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", passengerCount=" + passengerCount +
                ", selfdrive=" + selfdrive +
                '}';
    }
}
