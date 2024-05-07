package Project2;

public abstract class Product {
    private final int ID;
    private static int sharedID = 0;
    private String name;
    private Size size;
    private double price;
    private int qty;

    public Product(String name, Size size, double price, int qty){
        ID = sharedID++;
        this.name = name;
        this.size = size;
        this.price = price;
        this.qty = qty;
    }

    public int getID() {
        return ID;
    }

    public static int getSharedID() {
        return sharedID;
    }

    public static void setSharedID(int sharedID) {
        Product.sharedID = sharedID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
