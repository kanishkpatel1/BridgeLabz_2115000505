import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface ImportantMethod {  
    String level() default "HIGH";  
}  

class Application {  
    @ImportantMethod  
    void criticalFunction() {  
        System.out.println("Executing critical function...");  
    }  

    @ImportantMethod(level = "MEDIUM")  
    void importantFeature() {  
        System.out.println("Executing important feature...");  
    }  

    void normalFunction() {  
        System.out.println("Executing normal function...");  
    }  
}  

public class Q06_ImportantMethodAnnotation {  
    public static void main(String[] args) {  
        Method[] methods = Application.class.getDeclaredMethods();  
        for (Method method : methods) {  
            if (method.isAnnotationPresent(ImportantMethod.class)) {  
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);  
                System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());  
            }  
        }  
    }  
}  
