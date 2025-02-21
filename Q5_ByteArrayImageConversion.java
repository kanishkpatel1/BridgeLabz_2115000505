import java.io.*;

public class Q5_ByteArrayImageConversion {
    public static void main(String[] args) {
        String inputImagePath = "input.jpg";  
        String outputImagePath = "output.jpg";

        try {
            byte[] imageBytes = convertImageToByteArray(inputImagePath);
            writeByteArrayToImage(imageBytes, outputImagePath);
            System.out.println(" Image successfully converted to byte array and written back!");
        } catch (IOException e) {
            System.err.println(" Error: " + e.getMessage());
        }
    }

    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    public static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
