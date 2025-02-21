import java.io.*;

public class Q3_UserInput {
    public static void main(String[] args) {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();
            
            
            FileWriter writer = new FileWriter("user_data.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            writer.close();
            
            System.out.println("User data saved successfully in user_data.txt");
        } catch (IOException e) {
            System.err.println("Error reading input or writing to file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid age input. Please enter a valid number.");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
