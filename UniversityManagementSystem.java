import java.util.Scanner;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Roll Number:");
        int rollNumber = sc.nextInt();
        sc.nextLine(); // Consume the newline

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student CGPA:");
        double CGPA = sc.nextDouble();

        Student student = new Student(rollNumber, name, CGPA);
        student.displayDetails();

        System.out.println("\nEnter new CGPA:");
        double newCGPA = sc.nextDouble();
        student.setCGPA(newCGPA);
        System.out.println("Updated CGPA: " + student.getCGPA());

        System.out.println("\nEnter Postgraduate Student Roll Number:");
        int pgRollNumber = sc.nextInt();
        sc.nextLine(); // Consume the newline

        System.out.println("Enter Postgraduate Student Name:");
        String pgName = sc.nextLine();

        System.out.println("Enter Postgraduate Student CGPA:");
        double pgCGPA = sc.nextDouble();

        PostgraduateStudent pgStudent = new PostgraduateStudent(pgRollNumber, pgName, pgCGPA);
        pgStudent.displayPostgraduateDetails();

        sc.close();
    }
}
