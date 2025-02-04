import java.util.*;

class Student {
    static String universityName;
    static int numberOfStudents;
    final int rollNumber;
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        numberOfStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Number of students enrolled: " + numberOfStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}

public class Q05_UniversityStudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the University Name: ");
        Student.universityName = sc.nextLine();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for student " + i + ":");
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            System.out.print("Enter grade: ");
            char grade = sc.next().charAt(0);
            sc.nextLine();  // Consume newline

            Student student = new Student(name, roll, grade);
            students.add(student);
        }

        for (Student student : students) {
            student.displayStudentDetails();
        }

        Student.displayTotalStudents();
        sc.close();
    }
}
