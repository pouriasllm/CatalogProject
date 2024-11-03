import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatalogManager catalogManager = new CatalogManager();
        FileHandler fileHandler = new FileHandler();
        Scanner scanner = new Scanner(System.in);

        fileHandler.loadProducts(catalogManager);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Products");
            System.out.println("4. Save and Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Read new line

            if (choice == 1) {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                System.out.print("Enter product price: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Read new line
                System.out.print("Enter product category: ");
                String category = scanner.nextLine();
                catalogManager.addProduct(new Product(name, price, category));

            } else if (choice == 2) {
                System.out.print("Enter product name to remove: ");
                String name = scanner.nextLine();
                catalogManager.removeProduct(name);

            } else if (choice == 3) {
                System.out.println("Catalog Products:");
                catalogManager.showProducts();

            } else if (choice == 4) {
                fileHandler.saveProducts(catalogManager.getCatalog());
                System.out.println("Saved and exiting.");
                break;

            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
