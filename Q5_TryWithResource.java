import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q5_TryWithResource {
    public static void main(String[] args) {
        String filePath = "a.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String firstLine = br.readLine(); 
            System.out.println(firstLine != null ? firstLine : "File is empty");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
}
}
