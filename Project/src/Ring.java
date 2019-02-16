public class Ring extends Jewelry{

    public Ring(int id, String name, double price, int qty,  double weight, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.weight = weight;
        this.type = type;


    }
        public void refresh() {
            System.out.println(this.name + " is refreshed.");
        }


}
