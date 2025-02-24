import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface Todo {  
    String task();  
    String assignedTo();  
    String priority() default "MEDIUM";  
}  

class Project {  
    @Todo(task = "Implement user authentication", assignedTo = "Ayush", priority = "HIGH")  
    void userAuthentication() {  
        System.out.println("User authentication feature is pending.");  
    }  

    @Todo(task = "Optimize database queries", assignedTo = "Rahul")  
    void optimizeDatabase() {  
        System.out.println("Database optimization is pending.");  
    }  

    void completedFeature() {  
        System.out.println("This feature is completed.");  
    }  
}  

public class Q07_TodoAnnotation {  
    public static void main(String[] args) {  
        Method[] methods = Project.class.getDeclaredMethods();  
        for (Method method : methods) {  
            if (method.isAnnotationPresent(Todo.class)) {  
                Todo annotation = method.getAnnotation(Todo.class);  
                System.out.println("Task: " + annotation.task());  
                System.out.println("Assigned To: " + annotation.assignedTo());  
                System.out.println("Priority: " + annotation.priority());  
                System.out.println("---------------------------------");  
            }  
        }  
    }  
}  
