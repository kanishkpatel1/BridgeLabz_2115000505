import java.util.List;
import java.util.ArrayList;

public class Q8_UniversityManagement {

    public static class Course {
        private String courseName;
        private String courseCode;
        private Professor professor;
        private List<Student> students;

        public Course(String courseName, String courseCode) {
            this.courseName = courseName;
            this.courseCode = courseCode;
            this.students = new ArrayList<>();
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public Professor getProfessor() {
            return professor;
        }

        public void assignProfessor(Professor professor) {
            this.professor = professor;
        }

        public List<Student> getStudents() {
            return students;
        }

        public void enrollStudent(Student student) {
            students.add(student);
        }

        public void displayCourseInfo() {
            System.out.println("Course: " + courseName + " (" + courseCode + ")");
            System.out.println("Professor: " + professor.getName());
            System.out.println("Enrolled Students:");
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }

    public static class Student {
        private String name;
        private String studentId;
        private List<Course> courses;

        public Student(String name, String studentId) {
            this.name = name;
            this.studentId = studentId;
            this.courses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public List<Course> getCourses() {
            return courses;
        }

        public void enrollCourse(Course course) {
            courses.add(course);
            course.enrollStudent(this);
        }

        public void displayStudentInfo() {
            System.out.println("Student: " + name + " (" + studentId + ")");
            System.out.println("Enrolled Courses:");
            for (Course course : courses) {
                System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
            }
        }
    }

    public static class Professor {
        private String name;
        private String professorId;
        private List<Course> courses;

        public Professor(String name, String professorId) {
            this.name = name;
            this.professorId = professorId;
            this.courses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProfessorId() {
            return professorId;
        }

        public void setProfessorId(String professorId) {
            this.professorId = professorId;
        }

        public List<Course> getCourses() {
            return courses;
        }

        public void assignCourse(Course course) {
            courses.add(course);
            course.assignProfessor(this);
        }

        public void displayProfessorInfo() {
            System.out.println("Professor: " + name + " (" + professorId + ")");
            System.out.println("Teaching Courses:");
            for (Course course : courses) {
                System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
            }
        }
    }

    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Smith", "P12345");
        Course course1 = new Course("Computer Science 101", "CS101");
        Course course2 = new Course("Data Structures", "CS102");

        professor.assignCourse(course1);
        professor.assignCourse(course2);

        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student2.enrollCourse(course2);

        professor.displayProfessorInfo();
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        course1.displayCourseInfo();
    }
}
