public class Fashion  extends  Product{

    public int size;
    public String color;
    public String brand;

    public void wash() {
        System.out.println(this.name + " is clean");
    }
    public void drying() {
        System.out.println(this.name + "is drying");
    }
}
