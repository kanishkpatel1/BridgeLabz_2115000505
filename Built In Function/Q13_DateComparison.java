import java.time.LocalDate;
import java.util.Scanner;

public class Q13_DateComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (yyyy-MM-dd):");
        String date1Str = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date1Str);

        System.out.println("Enter the second date (yyyy-MM-dd):");
        String date2Str = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(date2Str);

        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }

        scanner.close();
    }
}
