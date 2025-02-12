import java.util.*;

public class Q01_StudentManagement {
    class StudentNode {
        int rollNumber;
        String name;
        int age;
        char grade;
        StudentNode next;

        public StudentNode(int rollNumber, String name, int age, char grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    private StudentNode head = null;

    public void addFirstStudent(int rollNumber, int age, String name, char grade) {
        addStudentRecord(0, rollNumber, age, name, grade);
    }

    public void addLastStudent(int rollNumber, int age, String name, char grade) {
        addStudentRecord(totalStudents(), rollNumber, age, name, grade);
    }
    public void addStudentRecord(int index, int rollNumber, int age, String name, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        StudentNode temp = head;
        int count = 0;
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }
        if(temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteStudent(int rollNumber) {
        if (head == null)
            return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public int totalStudents() {
        int count = 0;
        StudentNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    public StudentNode findStudent(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateStudent(int rollNumber, String newName, int newAge, char newGrade) {
        StudentNode student = findStudent(rollNumber);
        if (student != null) {
            student.name = newName;
            student.age = newAge;
            student.grade = newGrade;
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudentRecords() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age
                    + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Q01_StudentManagement sm = new Q01_StudentManagement();
        sm.addStudentRecord(0, 1, 20, "Rahul", 'C');
        sm.addStudentRecord(1, 2, 21, "Ayush", 'A');
        sm.addStudentRecord(2, 3, 22, "Priya", 'B');
        sm.displayStudentRecords();
        System.out.println("Total Students: " + sm.totalStudents());
        sm.updateStudent(2, "Ayush Kumar", 22, 'A');
        sm.displayStudentRecords();
        sm.deleteStudent(3);
        sm.displayStudentRecords();
        sm.addLastStudent(10, 23, "Kanishk", 'A');
        sm.addFirstStudent(30, 43, "Virat", 'B');
        sm.displayStudentRecords();
    }
}
