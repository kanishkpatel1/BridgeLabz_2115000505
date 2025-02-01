import java.util.Scanner;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;

    Vehicle() {
        this("Unknown Owner", "Unknown Vehicle Type");
    }

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName.trim();
        this.vehicleType = vehicleType.trim();
    }

    void displayVehicleDetails() {
        System.out.println("-----------------------------");
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : $" + registrationFee);
        System.out.println("-----------------------------");
    }

    static void updateRegistrationFee(double newRegistrationFee) {
        if (newRegistrationFee < 0) {
            System.out.println("Error: Registration fee cannot be negative!");
            return;
        }
        registrationFee = newRegistrationFee;
        System.out.println("\n✅ Registration Fee Updated Successfully!\n");
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Owner Name:");
        String ownerName = sc.nextLine();
        System.out.println("Enter Vehicle Type:");
        String vehicleType = sc.nextLine();

        Vehicle defaultVehicle = new Vehicle();
        Vehicle userVehicle = new Vehicle(ownerName, vehicleType);

        System.out.println("\n===== Default Vehicle Details =====");
        defaultVehicle.displayVehicleDetails();

        System.out.println("\n===== User-Entered Vehicle Details =====");
        userVehicle.displayVehicleDetails();

        System.out.println("\nEnter new registration fee:");
        double newRegistrationFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newRegistrationFee);

        System.out.println("\n===== Updated Vehicle Details =====");
        defaultVehicle.displayVehicleDetails();
        userVehicle.displayVehicleDetails();

        sc.close();
    }
}
