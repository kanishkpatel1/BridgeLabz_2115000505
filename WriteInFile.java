import java.io.*;

public class  WriteInFile{
    public static void main(String[] args) {
       
        String fileName = "user_input.txt";
        
        
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw);
            
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            
            while (true) {
                line = br.readLine(); 
                if ("exit".equals(line)) { 
                    break;
                }
                bw.write(line); 
                bw.newLine(); 
            }
            
            System.out.println("User input has been saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
