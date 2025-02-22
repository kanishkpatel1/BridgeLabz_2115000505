package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q10_IPAddressValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String ipAddress = sc.nextLine();

        if (isValidIPAddress(ipAddress)) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
    }

    public static boolean isValidIPAddress(String ipAddress) {
        String ipRegex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }
}

