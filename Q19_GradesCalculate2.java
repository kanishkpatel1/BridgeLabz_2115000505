import java.util.*;

public class Q19_GradesCalculate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        double[][] marks = new double[numStudents][3]; 
        double[] percentages = new double[numStudents]; 
        String[] grades = new String[numStudents]; 

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1));

            for (int j = 0; j < 3; j++) {  // Loop through the 3 subjects (0: Physics, 1: Chemistry, 2: Maths)
                String subject = "";
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else if (j == 2) subject = "Maths";
                
                double mark;
                do {
                    System.out.print("Enter marks in " + subject + ": ");
                    mark = sc.nextDouble();
                    if (mark < 0) {
                        System.out.println("Marks cannot be negative. Please enter valid marks.");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        System.out.println("\nResults for all students:");
        for (int i = 0; i < numStudents; i++) {
            String remarks = "";
            if (percentages[i] >= 80) {
                remarks = "Level 4 above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                remarks = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                remarks = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                remarks = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                remarks = "Remedial standards";
            }

            System.out.println("Student number " + (i + 1) + " - Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2] + ", Percentage: " + percentages[i] + ", Grade: " + grades[i] + ", Remarks: " + remarks);
        }
    }
}
