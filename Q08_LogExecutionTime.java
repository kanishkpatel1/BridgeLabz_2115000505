import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

class TaskProcessor {

    @LogExecutionTime
    void quickTask() {
        System.out.println("Executing quick task...");
    }

    @LogExecutionTime
    void slowTask() {
        System.out.println("Executing slow task...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Q08_LogExecutionTime {
    public static void main(String[] args) throws Exception {
        TaskProcessor processor = new TaskProcessor();

        Method[] methods = TaskProcessor.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(processor);
                long endTime = System.nanoTime();
                System.out.println("Execution Time for " + method.getName() + ": " + (endTime - startTime) / 1_000_000 + " ms\n");
            }
        }
    }
}
