import java.io.*;
import java.util.Scanner;

public class Q7_StudentData {
    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            System.out.print("Enter number of students: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numStudents; i++) {
                System.out.println("\nEnter details for Student " + (i + 1) + ":");
                System.out.print("Roll Number: ");
                int rollNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("GPA: ");
                double gpa = scanner.nextDouble();
                scanner.nextLine();

                dos.writeInt(rollNumber);
                dos.writeUTF(name);
                dos.writeDouble(gpa);
            }
            System.out.println(" Student details saved successfully!");
        } catch (IOException e) {
            System.err.println(" Error saving data: " + e.getMessage());
        }

        System.out.println("\n Retrieving Student Details:");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println(" Error retrieving data: " + e.getMessage());
        }

        scanner.close();
    }
}
