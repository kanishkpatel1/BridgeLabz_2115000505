import java.io.*;

public class Q2_BufferedStreams {
    public static void main(String[] args) throws IOException {
        String path = "q2.txt";
        try { 
            long time1=System.nanoTime();
            writeBuffer(path);
            long time2=System.nanoTime();
            System.out.println("Time taken to read and write using Buffered Steam "+(time2-time1));

            long time3=System.nanoTime();

            writeSteam(path);
            long time4=System.nanoTime();

            System.out.println("Time taken to read and write using FileInputSteam "+(time4-time3));


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void writeBuffer(String path) throws IOException {
        
        try (BufferedInputStream bi = new BufferedInputStream(new FileInputStream(path));
             BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("q2Out.txt"))) {
            byte arr[] = new byte[4096];
            int bytes;
            while ((bytes = bi.read(arr)) != -1) {
                bo.write(arr, 0, bytes);
            }
            System.out.println("File Copied Successfully");
        }
    }
    public static void writeSteam(String path) throws IOException{
       
        try( FileInputStream fis=new FileInputStream(path);
             FileOutputStream fos=new FileOutputStream("q22out.txt")   ){
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
