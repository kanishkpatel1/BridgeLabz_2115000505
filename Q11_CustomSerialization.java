import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String toJson() {
        Map<String, Object> jsonMap = new HashMap<>();
        try {
            Field[] fields = this.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(JsonField.class)) {
                    field.setAccessible(true);
                    String key = field.getAnnotation(JsonField.class).name();
                    Object value = field.get(this);
                    jsonMap.put(key, value);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return jsonMap.toString().replace("=", ": ");
    }
}

public class Q11_CustomSerialization {
    public static void main(String[] args) {
        User user = new User("Ayush", 25);
        System.out.println(user.toJson());
    }
}
