// import java.util.*;

// interface Taxable {
//     double calculateTax(); // Method to calculate tax
//     String getTaxDetails(); // Method to get tax details
// }

// abstract class Product {
//     private int productId;
//     private String name;
//     private double price;
//     private double discountRate; // Added discountRate

//     // Constructor to initialize product details
//     public Product(int productId, String name, double price, double discountRate) {
//         this.productId = productId;
//         this.name = name;
//         this.price = price;
//         this.discountRate = discountRate;
//     }

//     // Getter methods for encapsulation
//     public int getProductId() {
//         return productId;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public double getDiscountRate() {
//         return discountRate;
//     }

//     // Abstract method for discount calculation, to be implemented in subclasses
//     abstract double calculateDiscount();

//     // Method to display product details
//     void displayDetails() {
//         System.out.println("Product ID: " + productId);
//         System.out.println("Product Name: " + name);
//         System.out.println("Product Price: " + price);
//     }
// }

// class Electronics extends Product implements Taxable {
//     private double taxRate;

//     // Constructor for Electronics product
//     public Electronics(int productId, String name, double price, double taxRate, double discountRate) {
//         super(productId, name, price, discountRate);
//         this.taxRate = taxRate;
//     }

//     // Implementing discount for Electronics
//     @Override
//     double calculateDiscount() {
//         return getPrice() * getDiscountRate() / 100; // Discount based on input rate
//     }

//     // Implementing tax calculation for Electronics
//     @Override
//     public double calculateTax() {
//         return getPrice() * taxRate / 100;
//     }

//     // Get tax details for Electronics
//     @Override
//     public String getTaxDetails() {
//         return "Tax Rate: " + taxRate + "%";
//     }
// }

// class Clothing extends Product implements Taxable {
//     private double taxRate;

//     // Constructor for Clothing product
//     public Clothing(int productId, String name, double price, double taxRate, double discountRate) {
//         super(productId, name, price, discountRate);
//         this.taxRate = taxRate;
//     }

//     // Implementing discount for Clothing
//     @Override
//     double calculateDiscount() {
//         return getPrice() * getDiscountRate() / 100; // Discount based on input rate
//     }

//     // Implementing tax calculation for Clothing
//     @Override
//     public double calculateTax() {
//         return getPrice() * taxRate / 100;
//     }

//     // Get tax details for Clothing
//     @Override
//     public String getTaxDetails() {
//         return "Tax Rate: " + taxRate + "%";
//     }
// }

// class Groceries extends Product {
//     // Constructor for Groceries product
//     public Groceries(int productId, String name, double price, double discountRate) {
//         super(productId, name, price, discountRate);
//     }

//     // Implementing discount for Groceries
//     @Override
//     double calculateDiscount() {
//         return getPrice() * getDiscountRate() / 100; // Discount based on input rate
//     }
// }

// public class Q02_ECommercePlatform {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input number of products
//         System.out.print("Enter number of products: ");
//         int numberOfProducts = scanner.nextInt();
//         scanner.nextLine();  // consume the newline

//         List<Product> productList = new ArrayList<>();

//         // Input product details and create product objects
//         for (int i = 0; i < numberOfProducts; i++) {
//             System.out.println("\nEnter details for Product " + (i + 1) + ":");

//             // Input product type
//             System.out.print("Enter product type (Electronics/Clothing/Groceries): ");
//             String type = scanner.nextLine();

//             // Input product ID, name, price, and discount rate
//             System.out.print("Enter product ID: ");
//             int productId = scanner.nextInt();
//             scanner.nextLine();  // consume the newline

//             System.out.print("Enter product name: ");
//             String name = scanner.nextLine();

//             System.out.print("Enter product price: ");
//             double price = scanner.nextDouble();

//             System.out.print("Enter discount rate (in %): ");
//             double discountRate = scanner.nextDouble();

//             // Create product object based on type
//             if (type.equalsIgnoreCase("Electronics")) {
//                 System.out.print("Enter tax rate for Electronics: ");
//                 double taxRate = scanner.nextDouble();
//                 productList.add(new Electronics(productId, name, price, taxRate, discountRate));
//             } else if (type.equalsIgnoreCase("Clothing")) {
//                 System.out.print("Enter tax rate for Clothing: ");
//                 double taxRate = scanner.nextDouble();
//                 productList.add(new Clothing(productId, name, price, taxRate, discountRate));
//             } else if (type.equalsIgnoreCase("Groceries")) {
//                 productList.add(new Groceries(productId, name, price, discountRate));
//             } else {
//                 System.out.println("Invalid product type. Skipping...");
//             }
//             scanner.nextLine();  // consume the newline
//         }

//         // Calculate and display final price for each product
//         for (Product product : productList) {
//             product.displayDetails();

//             // Calculating tax if the product is taxable
//             double tax = 0;
//             if (product instanceof Taxable) {
//                 tax = ((Taxable) product).calculateTax();
//             }

//             // Final price = price + tax - discount
//             double discount = product.calculateDiscount();
//             double finalPrice = product.getPrice() + tax - discount;

//             System.out.println("Discount: " + discount);
//             System.out.println("Tax: " + tax);
//             System.out.println("Final Price: " + finalPrice);
//             System.out.println("------------------------------------");
//         }

//         scanner.close(); // Close scanner
//     }
// }







import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;
    private double discountRate;

    public Product(int productId, String name, double price, double discountRate) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    abstract double calculateDiscount();

    void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}

class Electronics extends Product implements Taxable {
    private double taxRate;

    public Electronics(int productId, String name, double price, double taxRate, double discountRate) {
        super(productId, name, price, discountRate);
        this.taxRate = taxRate;
    }

    @Override
    double calculateDiscount() {
        return getPrice() * getDiscountRate() / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate / 100;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate + "%";
    }
}

class Clothing extends Product implements Taxable {
    private double taxRate;

    public Clothing(int productId, String name, double price, double taxRate, double discountRate) {
        super(productId, name, price, discountRate);
        this.taxRate = taxRate;
    }

    @Override
    double calculateDiscount() {
        return getPrice() * getDiscountRate() / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate / 100;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate + "%";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price, double discountRate) {
        super(productId, name, price, discountRate);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * getDiscountRate() / 100;
    }
}

public class Q02_ECommercePlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine();

        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");

            System.out.print("Enter product type (Electronics/Clothing/Groceries): ");
            String type = scanner.nextLine();

            System.out.print("Enter product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter discount rate (in %): ");
            double discountRate = scanner.nextDouble();

            if (type.equalsIgnoreCase("Electronics")) {
                System.out.print("Enter tax rate for Electronics: ");
                double taxRate = scanner.nextDouble();
                productList.add(new Electronics(productId, name, price, taxRate, discountRate));
            } else if (type.equalsIgnoreCase("Clothing")) {
                System.out.print("Enter tax rate for Clothing: ");
                double taxRate = scanner.nextDouble();
                productList.add(new Clothing(productId, name, price, taxRate, discountRate));
            } else if (type.equalsIgnoreCase("Groceries")) {
                productList.add(new Groceries(productId, name, price, discountRate));
            } else {
                System.out.println("Invalid product type. Skipping...");
            }
            scanner.nextLine();
        }

        for (Product product : productList) {
            product.displayDetails();

            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }

            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("<<----->>");
        }

        scanner.close();
    }
}

