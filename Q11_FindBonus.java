import java.util.*;

public class Q11_FindBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployees = 10;
        double[] salary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        int index = 0;

        while (index < numEmployees) {
            System.out.print("Enter salary for employee " + (index + 1) + ": ");
            double employeeSalary = sc.nextDouble();

            if (employeeSalary <= 0) {
                System.out.println("enter a positive value.");
                continue;
            }

            System.out.print("Enter years of service for employee " + (index + 1) + ": ");
            double serviceYears = sc.nextDouble();

            if (serviceYears < 0) {
                System.out.println("Please enter a positive value for years of service.");
                continue;
            }

            salary[index] = employeeSalary;
            yearsOfService[index] = serviceYears;

            index++;
        }

        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}
