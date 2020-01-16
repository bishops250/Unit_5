public class Item {

    private String part_number;
    private String part_description;
    private double part_price;

    public Item() {
        this.part_number="";
        part_description="";
        part_price=0.0;

    }

    public String toString() {
        return "Item: " + this.part_number + "\nPrice: " + this.part_price + "\nDescription: " + this.part_description;
    }


    public Item(String part_number, String part_description, double part_price) {

        if(part_price<=0) {
            part_price=0;
        }
        this.part_number = part_number;
        this.part_description = part_description;
        this.part_price = part_price;
    }

    public  double getTotalPrice(int quantity) {
        return this.part_price*quantity;
    }

}
