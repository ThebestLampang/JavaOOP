public class Product {
    // Attribute
    private String name;
    private double price;
    private int quantity;

    // static
    private static int count = 0;


    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // เพิ่มจำนวน Object
    public void addCount() {
        count++;
    }

    // อ่านจำนวน Object
    public static int getCount() {
        return count;
    }

}
