import java.io.*;
public class CompareTimeandReadFile {
   public static void main(String[] args) {
        compareStringConcatenation();
        compareFileReading("File100mb.txt"); 
    }

    private static void compareStringConcatenation() {
        String text = "hello";
        int iterations = 1000000;

        
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1e6 + " ms");
    }

    private static void compareFileReading(String fileName) {
        long startTime, endTime;
        int wordCount = 0;

     
        startTime = System.nanoTime();
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        endTime = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount);
        System.out.println("FileReader time: " + (endTime - startTime) / 1e6 + " ms");

       
        wordCount = 0;

        startTime = System.nanoTime();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount);
        System.out.println("InputStreamReader time: " + (endTime - startTime) / 1e6 + " ms");
    }
}

