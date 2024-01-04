package JavaCore.task03;

public class Donut {
    private String shape;
    private int size;
    private String flavor;
    private String ingredients;
    private String decor;

    public Donut(String shape, int size, String flavor, String ingredients, String decor) {
        this.shape = shape;
        this.size = size;
        this.flavor = flavor;
        this.ingredients = ingredients;
        this.decor = decor;
    }

   public Donut(String shape, int size) {
        this.shape = shape;
        this.size = size;
    }

    public Donut(String shape, int size, String flavor) {
        this.shape = shape;
        this.size = size;
        this.flavor = flavor;

    }


    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getIngredients() {
        return ingredients;
    }


    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDecor() {
        return decor;
    }

    public void setDecor(String decor) {
        this.decor = decor;
    }






    @Override
    public String toString() {
        return "Donut{" +
                "shape='" + shape + '\'' +
                ", size=" + size +
                ", flavor='" + flavor + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", decor='" + decor + '\'' +
                '}';
    }
  //  public String toString() {
   //     return ("Donut: " + shape + "," + size + "," + flavor + "," + ingredients + "," + decor);
  //  }
}
