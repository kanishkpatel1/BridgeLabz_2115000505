import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) {
        try {
            System.out.print("Enter fully qualified class name: ");
            String className = new java.util.Scanner(System.in).nextLine();
            Class<?> clazz = Class.forName(className);

            System.out.println("Class: " + clazz.getName());

            System.out.println("Constructors:");
            for (Constructor<?> constructor : clazz.getConstructors()) {
                System.out.println(constructor);
            }

            System.out.println("Fields:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field);
            }

            System.out.println("Methods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println(method);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
