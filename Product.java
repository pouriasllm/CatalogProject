public class Product {
    String name;
    double price;
    String category;
    
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public String toString() {
        return name + "," + price + "," + category;
    }
}