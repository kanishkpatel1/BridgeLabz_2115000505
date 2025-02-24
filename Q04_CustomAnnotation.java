import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)  
@interface TaskInfo {  
    String priority();  
    String assignedTo();  
}  

@TaskInfo(priority = "HIGH", assignedTo = "John Doe")  
class TaskManager {  
    void executeTask() {  
        System.out.println("Executing task...");  
    }  
}  

public class Q04_CustomAnnotation {  
    public static void main(String[] args) {  
        Class<TaskManager> taskClass = TaskManager.class;  
        if (taskClass.isAnnotationPresent(TaskInfo.class)) {  
            TaskInfo taskInfo = taskClass.getAnnotation(TaskInfo.class);  
            System.out.println("Priority: " + taskInfo.priority());  
            System.out.println("Assigned To: " + taskInfo.assignedTo());  
        }  
    }  
}  
