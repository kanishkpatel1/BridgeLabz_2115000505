import java.util.Scanner;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    Course() {
        this("Unknown Course", 0, 0.0);
    }

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("-----------------------------");
        System.out.println("Course Name     : " + courseName);
        System.out.println("Duration        : " + duration + " months");
        System.out.println("Fee            : $" + String.format("%.2f", fee));
        System.out.println("Institute Name  : " + instituteName);
        System.out.println("-----------------------------");
    }

    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Course Name:");
        String courseName = sc.nextLine();
        System.out.println("Enter Course Duration (in months):");
        int duration = sc.nextInt();
        System.out.println("Enter Course Fee:");
        double fee = sc.nextDouble();

        Course defaultCourse = new Course();
        Course userCourse = new Course(courseName, duration, fee);

        System.out.println("\n===== Default Course Details =====");
        defaultCourse.displayCourseDetails();

        System.out.println("\n===== User-Entered Course Details =====");
        userCourse.displayCourseDetails();

        sc.nextLine();
        System.out.println("\nEnter new institute name:");
        String newInstituteName = sc.nextLine();
        Course.updateInstituteName(newInstituteName);

        System.out.println("\n===== Updated Course Details =====");
        defaultCourse.displayCourseDetails();
        userCourse.displayCourseDetails();

        sc.close();
    }
}
