import java.io.*;
public class Q1_FileInput{
    public static void main(String[] args) {
        String path="a.txt";
        try(
        BufferedReader br=new BufferedReader(new FileReader(path));){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println("File not Found "+e.getMessage());
        }
    }
}