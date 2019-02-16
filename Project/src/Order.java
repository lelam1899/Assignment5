import java.util.ArrayList;

public class Order {
    public int idOrder;
    public double total;
    public ArrayList<Product> listProduct = new ArrayList<Product>();

    public Order(int idOrder) {
        this.idOrder = idOrder;
        this.total = 0;
    }
    public void addProduct(Product p) {
        if(p.qty > 0) {
            listProduct.add(p);
            this.total += p.price;
            p.qty--;
        } else {
            System.out.println(p.name + " is out.");
        }

    }
    public void addProduct(Product p, int qty) {
        if(p.qty >= qty) {
            for(int i = 0; i < qty; i++) {
                listProduct.add(p);
            }
            this.total += p.price*qty;
            p.qty -= qty;
        } else {
            System.out.println(p.name + " is not enough.");
        }

    }
    public void addProduct(Product p,int qty, int discount) {
        if(p.qty >= qty) {
            for(int i = 0; i < qty; i++) {
                listProduct.add(p);
            }
            this.total += p.price*(100-discount)/100*qty;
            p.qty -= qty;
        } else {
            System.out.println(p.name + " is not enough.");
        }

    }
    public void showItemList() {
        if(listProduct.size() > 0) {
            System.out.println("List items: ");
            for (int i = 0; i < listProduct.size(); i++) {
                System.out.println(listProduct.get(i).name);
            }
        } else {
            System.out.println("No product");
        }
    }
}
