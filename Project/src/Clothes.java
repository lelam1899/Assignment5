public class Clothes extends  Fashion{

    public Clothes(int id, String name, double price, int qty, int size,
                   String color, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.size = size;
        this.color = color;
        this.brand = brand;

    }

    public void wash() {

        System.out.println(this.name + " is clean");
    }

    public void drying() {

        System.out.println(this.name + "is drying");
    }
}
