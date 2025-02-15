import java.io.BufferedReader;
import java.io.FileReader;

public class CountOccurrenceOfWord {
    public static void main(String[] args) {
         String path="a.txt";
         String targeWord="this";
         int count=0;
        try {
            BufferedReader br=new BufferedReader( new FileReader(path));
            String line;
            
            while((line =br.readLine())!=null){
                String str[]=line.split(" ");
                for(String s:str){
                    if(s.equals(targeWord)){
                        count++;
                    }
                }
            }
            System.out.println("Occurence of the word "+targeWord+" in the file is: "+count);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
