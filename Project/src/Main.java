import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> listProductInStore = new ArrayList<Product>();

        Clothes shirt1 = new Clothes(1, "shirt", 100,
                20, 30, "white", "Owen");
        listProductInStore.add(shirt1);

        Ring ring1 = new Ring(11, "ring", 500, 10, 1,  "");
        listProductInStore.add(ring1);


        Order order1 = new Order(1);
        order1.addProduct(shirt1, 2);
        order1.addProduct(ring1, 3, 10);


        order1.showItemList();
        System.out.println("Total: " + order1.total);



        System.out.println("\n\nProduct in store");
        for(int i = 0; i < listProductInStore.size(); i++) {
            if(listProductInStore.get(i).price > 0) {
                System.out.println(listProductInStore.get(i).name + ": "
                + listProductInStore.get(i).qty );
            } 
        }



    }

}
