import java.io.*;
import java.util.*;
public class LargeFileReader {

    public static void read1mb(){
        String path="1mb.txt";
        String res="";
        long time1=System.nanoTime();
        
        try{
            BufferedReader b=new BufferedReader(new FileReader(path));
            String line;
            while((line=b.readLine())!=null){
                res+=line;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        long time2=System.nanoTime();
        System.out.println("Time taken by FileReader to read 1 mb file is "+(time2-time1));
        
         String res1="";
        long time3=System.nanoTime();
        
        try{
            FileInputStream f=new FileInputStream(path);

            BufferedReader b=new BufferedReader(new InputStreamReader(f,"utf-8"));
            String line;
            while((line=b.readLine())!=null){
                res+=line;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        long time4=System.nanoTime();
        System.out.println("Time taken by Input Stream Reader to read 1 mb file is "+(time4-time3));
        
    }
    
    public static void read100mb(){
        String path="100mb.txt";
        String res="";
        long time1=System.nanoTime();
        
        try{
            BufferedReader b=new BufferedReader(new FileReader(path));
            String line;
            while((line=b.readLine())!=null){
                res+=line;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        long time2=System.nanoTime();
        System.out.println("Time taken by FileReader to read 100 mb file is "+(time2-time1));
        
         String res1="";
        long time3=System.nanoTime();
        
        try{
            FileInputStream f=new FileInputStream(path);

            BufferedReader b=new BufferedReader(new InputStreamReader(f,"utf-8"));
            String line;
            while((line=b.readLine())!=null){
                res+=line;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        long time4=System.nanoTime();
        System.out.println("Time taken by Input Stream Reader to read 100 mb file is "+(time4-time3));
        
    }
    
    public static void read500mb(){
        String path="1mb.txt";
        String res="";
        long time1=System.nanoTime();
        
        try{
            BufferedReader b=new BufferedReader(new FileReader(path));
            String line;
            while((line=b.readLine())!=null){
                res+=line;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        long time2=System.nanoTime();
        System.out.println("Time taken by FileReader to read 500 mb file is "+(time2-time1));
        
         String res1="";
        long time3=System.nanoTime();
        
        try{
            FileInputStream f=new FileInputStream(path);

            BufferedReader b=new BufferedReader(new InputStreamReader(f,"utf-8"));
            String line;
            while((line=b.readLine())!=null){
                res+=line;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        long time4=System.nanoTime();
        System.out.println("Time taken by Input Stream Reader to read 500 mb file is "+(time4-time3));
        
    }
    
    
    public static void main(String[] args) {
        read1mb();
        read100mb();
        read500mb();
    }
}
