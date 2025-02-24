import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";
}

public class ModifyStaticField {
    public static void main(String[] args) {
        try {
            Field field = Configuration.class.getDeclaredField("API_KEY");
            field.setAccessible(true);
            field.set(null, "NEW_API_KEY");
            System.out.println("Modified API_KEY: " + field.get(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
