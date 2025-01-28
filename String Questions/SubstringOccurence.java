import java.util.Scanner;

public class SubstringOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String subString = sc.next();

        int count = 0; 
        int index = s.indexOf(subString); 
        while (index != -1) {
            count++; 
            index = s.indexOf(subString, index + subString.length());
        }

        System.out.println("The substring occurs " + count + " times.");
    }
}
