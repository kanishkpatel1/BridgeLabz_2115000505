import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        validateLength(username);
        this.username = username;
    }

    private void validateLength(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (username.length() > maxLength) {
                    throw new IllegalArgumentException("Username exceeds max length of " + maxLength);
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

public class Q09_MaxLength {
    public static void main(String[] args) {
        try {
            User user1 = new User("Ayush");
            System.out.println("User created successfully.");
            
            User user2 = new User("AyushKumarSingh"); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
