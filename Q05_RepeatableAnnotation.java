import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@Repeatable(BugReports.class)  
@interface BugReport {  
    String description();  
}  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface BugReports {  
    BugReport[] value();  
}  

class Software {  
    @BugReport(description = "Null pointer exception in edge case")  
    @BugReport(description = "Performance issue when handling large data")  
    void run() {  
        System.out.println("Running software...");  
    }  
}  

public class Q05_RepeatableAnnotation {  
    public static void main(String[] args) {  
        try {  
            Method method = Software.class.getMethod("run");  
            if (method.isAnnotationPresent(BugReports.class)) {  
                BugReports reports = method.getAnnotation(BugReports.class);  
                for (BugReport report : reports.value()) {  
                    System.out.println("Bug: " + report.description());  
                }  
            }  
        } catch (NoSuchMethodException e) {  
            System.out.println("Exception: " + e);  
        }  
    }  
}  
