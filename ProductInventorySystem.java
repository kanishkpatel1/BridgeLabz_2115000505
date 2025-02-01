import java.util.Scanner;

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product() {
        this("Unknown Product", 0.0);
    }

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("----------------------------");
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : $" + String.format("%.2f", price));
        System.out.println("----------------------------");
    }

    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class ProductInventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Name:");
        String name = sc.nextLine();
        System.out.println("Enter Product Price:");
        double price = sc.nextDouble();

        Product defaultProduct = new Product();
        Product userProduct = new Product(name, price);

        System.out.println("\n===== Default Product Details =====");
        defaultProduct.displayProductDetails();

        System.out.println("\n===== User-Entered Product Details =====");
        userProduct.displayProductDetails();

        System.out.println("\n===== Total Products Count =====");
        Product.displayTotalProducts();

        sc.close();
    }
}
