import java.lang.reflect.Field;

class Person {
    private String name = "Ayush";
    private int age = 25;
}

public class JsonConverter {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");
        try {
            Field[] fields = obj.getClass().getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                json.append("\"").append(fields[i].getName()).append("\": \"")
                    .append(fields[i].get(obj)).append("\"");
                if (i < fields.length - 1) {
                    json.append(", ");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Error converting to JSON", e);
        }
        return json.append("}").toString();
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(toJson(person));
    }
}
