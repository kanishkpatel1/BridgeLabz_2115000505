import java.util.Scanner;

class CarRental {
    String customerName, carModel;
    int rentalDays;
    double rentalRate; // Per day rental rate

    // Default Constructor
    CarRental() {
        this("Default Customer", "Sedan", 3, 1000.0);
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays, double rentalRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRate = rentalRate;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * rentalRate;
    }

    // Display Rental Details
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Rate per Day: $" + rentalRate);
        System.out.println("Total Rental Cost: $" + String.format("%.2f", calculateTotalCost()));
    }
}

// Main Class
public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();
        System.out.println("Enter Car Model:");
        String carModel = sc.nextLine();
        System.out.println("Enter Rental Days:");
        int rentalDays = sc.nextInt();
        System.out.println("Enter Rental Rate per Day:");
        double rentalRate = sc.nextDouble();

        // Creating car rental objects
        CarRental defaultRental = new CarRental(); // Default constructor
        CarRental userRental = new CarRental(customerName, carModel, rentalDays, rentalRate); // Parameterized constructor

        // Displaying rental details
        System.out.println("\n===== Default Rental Details =====");
        defaultRental.display();
        
        System.out.println("\n===== User-Entered Rental Details =====");
        userRental.display();

        sc.close();
    }
}
