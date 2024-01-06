package JavaCore.task07;

public class AmbulanceCar extends Car{
    private String specificSignal;

    public  AmbulanceCar(){
        super();
    }

    public String getSpecificSignal() {
        return specificSignal;
    }

    public void setSpecificSignal(String specificSignal) {
        this.specificSignal = specificSignal;
    }

    @Override
    public String toString() {
        return "AmbulanceCar{" +
                "specificSignal='" + specificSignal + '\'' +
                '}';
    }

    public void siren(){
        System.out.println("Ambulance car is siren.");

    }  public void enterTheHospital(){
        System.out.println("Ambulance car is entering the hospital.");
    }
}
