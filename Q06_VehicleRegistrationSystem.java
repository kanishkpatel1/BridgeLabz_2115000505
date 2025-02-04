
import java.util.*;

class Vehicle {
    static double registrationFee; 
    final int registrationNumber; 
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("\nVehicle Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

public class Q06_VehicleRegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial registration fee: ");
        Vehicle.registrationFee = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.print("Enter the number of vehicles to register: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for vehicle " + i + ":");
            System.out.print("Enter Owner Name: ");
            String ownerName = sc.nextLine();

            System.out.print("Enter Vehicle Type: ");
            String vehicleType = sc.nextLine();

            System.out.print("Enter Registration Number: ");
            int registrationNumber = sc.nextInt();
            sc.nextLine(); // Consume newline

            Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);
            vehicles.add(vehicle);
        }

        System.out.print("\nDo you want to update the registration fee? (yes/no): ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the new registration fee: ");
            double newFee = sc.nextDouble();
            Vehicle.updateRegistrationFee(newFee);
        }

        // Display all registered vehicle details
        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicleDetails();
        }

        sc.close();
    }
}
