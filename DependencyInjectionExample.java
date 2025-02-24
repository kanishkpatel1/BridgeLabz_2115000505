import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Service {
    void serve() {
        System.out.println("Service is running...");
    }
}

class Client {
    @Inject
    private Service service;

    void doSomething() {
        service.serve();
    }
}

class DIContainer {
    static void injectDependencies(Object obj) {
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    field.setAccessible(true);
                    field.set(obj, field.getType().getDeclaredConstructor().newInstance());
                } catch (Exception e) {
                    throw new RuntimeException("Dependency injection failed: " + e.getMessage());
                }
            }
        }
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) {
        Client client = new Client();
        DIContainer.injectDependencies(client);
        client.doSomething();
    }
}
