package JavaCore.task01;

public class Car {
    private String model; //az osztályon kívül nem elérhetőek ezek a tulajdonságiok
    private String color;
   // String model;
  //  String color;
    private String age;

    public void setAge(String age) {
        this.age = age;
    }

    public  void setModel(String newModel) {
        model = newModel;
    }

    public  void setColor(String newColor) {
        color = newColor;
    }

    public String getModel(){
        return  model;
    }

    public String getValues() {

        return "Model: " + model + " Color: " + color;
    }
}
