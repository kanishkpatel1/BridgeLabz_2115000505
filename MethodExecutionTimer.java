import java.lang.reflect.Method;

class SampleClass {
    void fastMethod() {
        for (int i = 0; i < 1000; i++);
    }

    void slowMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {}
    }
}

public class MethodExecutionTimer {
    static void measureExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            long startTime = System.nanoTime();
            method.invoke(obj);
            long endTime = System.nanoTime();
            System.out.println(methodName + " execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SampleClass sample = new SampleClass();
        measureExecutionTime(sample, "fastMethod");
        measureExecutionTime(sample, "slowMethod");
    }
}
