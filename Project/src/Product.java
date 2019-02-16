import java.util.ArrayList;

public class Product {
    public int id;
    public String name;
    public double price;
    public int qty;

    Product() {

    }
    public Product(int id, String name, int price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public int getQty() {
        return this.qty;
    }
}
