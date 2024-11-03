import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private String fileName = "products.txt"; 

    public void saveProducts(ArrayList<Product> products) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Product product : products) {
                writer.write(product.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving products");
        }
    }

    public void loadProducts(CatalogManager manager) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                String category = parts[2];
                manager.addProduct(new Product(name, price, category));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading products");
        }
    }
}
