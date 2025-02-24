import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }

    public void publicTask() {
        System.out.println("Public task executed.");
    }

    public void executeMethod(String userRole, String methodName) {
        try {
            Method method = this.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();
                if (!requiredRole.equals(userRole)) {
                    System.out.println("Access Denied!");
                    return;
                }
            }
            method.invoke(this);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class Q10_RoleBasedAccess {
    public static void main(String[] args) {
        SecureService service = new SecureService();

        System.out.println("User with ADMIN role:");
        service.executeMethod("ADMIN", "adminTask");

        System.out.println("\nUser with USER role:");
        service.executeMethod("USER", "adminTask");

        System.out.println("\nExecuting public method:");
        service.executeMethod("USER", "publicTask");
    }
}
