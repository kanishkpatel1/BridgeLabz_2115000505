import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1_FileHandling{
    public static void main(String[] args) throws IOException {
        String path="q1.txt";
        try( FileInputStream fis=new FileInputStream(path);
             FileOutputStream fos=new FileOutputStream("q1out.txt")   ){
                int byte1;
                while((byte1=fis.read())!=-1){
                    fos.write(byte1);
                }
                System.out.println("File Copied Successfully");
        }
        catch(Exception e) {
            System.out.println("File at path "+path+" not Found ");
        }
    }
}