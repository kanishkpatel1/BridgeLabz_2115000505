import java.lang.reflect.Constructor;

class Student {
    String name;

    public Student() {
        this.name = "Default Student";
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            Class<Student> studentClass = Student.class;
            Constructor<Student> constructor = studentClass.getDeclaredConstructor();
            Student student = constructor.newInstance();
            student.display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
