// import java.util.ArrayList;
// import java.util.List;

// // Abstract class representing a warehouse item
// abstract class WarehouseItem {
//     private String name;
//     private double price;

//     public WarehouseItem(String name, double price) {
//         this.name = name;
//         this.price = price;
        
//     }

//     public String getName() { return name; }
//     public double getPrice() { return price; }

//     @Override
//     public String toString() {
//         return name + " ($" + price + ")";
//     }
// }

// // Electronics category
// class Electronics extends WarehouseItem {
//     int quantity;
//     public Electronics(String name, double price, int quantity) {
//         super(name, price);
//         this.quantity=quantity;
//     }
// }

// // Groceries category
// class Groceries extends WarehouseItem {
//     public Groceries(String name, double price) {
//         super(name, price);
//     }
// }

// // Furniture category
// class Furniture extends WarehouseItem {
//     int warranty;
//     public Furniture(String name, double price, int warranty) {
//         super(name, price);
//         this.warranty = warranty;
//     }
// }

// // Generic Storage class
// class Storage<T extends WarehouseItem> {
//     private List<T> items = new ArrayList<>();

//     public void addItem(T item) {
//         items.add(item);
//     }

//     public List<T> getItems() {
//         return items;
//     }

//     // Wildcard method to display any type of WarehouseItem
//     public static <T>  void displayItems(List<T> items) {
//         for (T item : items) {
//             System.out.println(item);
//         }
//     }
// }

// // Main class for testing
// public class SmartWarehouse {
//     public static void main(String[] args) {
//         Storage<Electronics> electronicsStorage = new Storage<>();
       
//         Electronics e=new Electronics("Headphone",1500,111);
//         // electronicsStorage.addItem(e);
//         electronicsStorage.addItem(new Electronics("Laptop", 1200.99,12));
//         electronicsStorage.addItem(new Electronics("Smartphone", 799.49));

//         Storage<Groceries> groceriesStorage = new Storage<>();
//         groceriesStorage.addItem(new Groceries("Apple", 0.99));
//         groceriesStorage.addItem(new Groceries("Milk", 2.50));

//         Storage<Furniture> furnitureStorage = new Storage<>();
//         furnitureStorage.addItem(new Furniture("Sofa", 450.00,2));
//         furnitureStorage.addItem(new Furniture("Dining Table", 899.99,3));

//         System.out.println("Electronics in Storage:");
//         Storage.displayItems(electronicsStorage.getItems());

//         System.out.println("\nGroceries in Storage:");
//         Storage.displayItems(groceriesStorage.getItems());

//         System.out.println("\nFurniture in Storage:");
//         Storage.displayItems(furnitureStorage.getItems());
//     }
// }









import java.util.ArrayList;
import java.util.List;

// Abstract class representing a warehouse item
abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

// Electronics category
class Electronics extends WarehouseItem {
    int quantity;

    public Electronics(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + " [Quantity: " + quantity + "]";
    }
}

// Groceries category
class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }
}

// Furniture category
class Furniture extends WarehouseItem {
    int warranty;

    public Furniture(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.toString() + " [Warranty: " + warranty + " years]";
    }
}

// Generic Storage class
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // Wildcard method to display any type of WarehouseItem
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

// Main class for testing
public class SmartWarehouse {
    public static void main(String[] args) {
        // Electronics storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Headphone", 1500, 10));
        electronicsStorage.addItem(new Electronics("Laptop", 1200.99, 5));
        electronicsStorage.addItem(new Electronics("Smartphone", 799.49, 20));

        // Groceries storage
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 0.99));
        groceriesStorage.addItem(new Groceries("Milk", 2.50));
        groceriesStorage.addItem(new Groceries("Bread", 1.20));

        // Furniture storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Sofa", 450.00, 2));
        furnitureStorage.addItem(new Furniture("Dining Table", 899.99, 3));
        furnitureStorage.addItem(new Furniture("Chair", 149.99, 1));

        // Display items
        System.out.println("📌 Electronics in Storage:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\n🛒 Groceries in Storage:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\n🪑 Furniture in Storage:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}

