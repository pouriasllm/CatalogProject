import java.util.ArrayList;

public class CatalogManager {
    private ArrayList<Product> catalog = new ArrayList<>();

    public void addProduct(Product product) {
        catalog.add(product);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).name.equals(name)) {
                catalog.remove(i);
                break;
            }
        }
    }

    public void showProducts() {
        for (Product product : catalog) {
            System.out.println(product);
        }
    }

    
    public ArrayList<Product> getCatalog() {
        return catalog;
    }
}
