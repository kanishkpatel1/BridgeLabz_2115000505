import java.util.*;

public class Q18_GradesCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        double[][] marks = new double[numStudents][3]; 
        double[] percentages = new double[numStudents]; 
        String[] grades = new String[numStudents]; 

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1));

            double physics, chemistry, maths;

            do {
                System.out.print("Enter marks in Physics: ");
                physics = sc.nextDouble();
                if (physics < 0) {
                    System.out.println("Marks cannot be negative enter valid marks.");
                }
            } while (physics < 0);

            do {
                System.out.print("Enter marks in Chemistry: ");
                chemistry = sc.nextDouble();
                if (chemistry < 0) {
                    System.out.println("Marks cannot be negative enter valid marks.");
                }
            } while (chemistry < 0);

            do {
                System.out.print("Enter marks in Maths: ");
                maths = sc.nextDouble();
                if (maths < 0) {
                    System.out.println("Marks cannot be negative enter valid marks.");
                }
            } while (maths < 0);

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            double totalMarks = physics + chemistry + maths;
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

            System.out.println("Student number " + (i + 1) + " Marks in Physics: " + marks[i][0] + ", Marks in Chemistry: " + marks[i][1] + ", Marks in Maths: " + marks[i][2] + ", Percentage: " + percentages[i] + ", Grade: " + grades[i] + ", Remarks: " + remarks);
        }
    }
}
