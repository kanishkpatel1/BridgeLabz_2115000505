import java.lang.reflect.Field;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }
}

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            person.displayAge();

            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);

            ageField.set(person, 30);
            System.out.println("Modified age using reflection:");
            person.displayAge();

            int newAge = (int) ageField.get(person);
            System.out.println("Retrieved age: " + newAge);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
