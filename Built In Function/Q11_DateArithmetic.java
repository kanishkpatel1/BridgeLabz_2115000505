import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q11_DateArithmetic {

    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 1, 28);  // Example input date
        System.out.println("Original Date: " + inputDate);

        LocalDate newDate = inputDate.plusDays(7)
                                     .plusMonths(1)
                                     .plusYears(2)
                                     .minusWeeks(3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date after adding 7 days, 1 month, and 2 years, then subtracting 3 weeks: " + newDate.format(formatter));
    }
}
