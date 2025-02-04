import java.util.*;
class Product{
    static double discount;
    final int productID;
    String productName;
    double price;
    double quantity;
    static int idCounter=1;
    Product(String productName,double price,double quantity){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productID=idCounter++;
    }
    static void updateDiscount(double newDiscount){
        discount=newDiscount;
    }
    void displayProductDetails(){
        System.out.println("\nProduct Details:");
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }
}
public class Q04_ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        Product.updateDiscount(discount);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Product " + i + ":");
            System.out.print("Enter Product Name: ");
            String productName = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, price, quantity);
            products.add(product);
        }

        for (Product product : products) {
            product.displayProductDetails();
        }

        sc.close();
    }
    
}
