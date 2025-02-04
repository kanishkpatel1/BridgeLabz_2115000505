import java.util.*;

class Patient {
    static String hospitalName;
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("\nPatient Details:");
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

public class Q07_PatientManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Hospital Name: ");
        Patient.hospitalName = sc.nextLine();

        System.out.print("Enter the number of patients to admit: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Patient> patients = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Patient " + i + ":");
            System.out.print("Enter Patient ID: ");
            int patientID = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Ailment: ");
            String ailment = sc.nextLine();

            Patient patient = new Patient(patientID, name, age, ailment);
            patients.add(patient);
        }

        for (Patient patient : patients) {
            patient.displayPatientDetails();
        }

        Patient.getTotalPatients();

        sc.close();
    }
}
