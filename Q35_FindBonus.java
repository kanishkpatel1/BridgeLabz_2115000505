import java.util.*;

public class Q35_FindBonus {

    public static double[][] generateSalariesAndYearsOfService() {
        double[][] employees = new double[10][2];

        for (int i = 0; i < 10; i++) {
            double salary = 10000 + Math.random() * 90000;
            int yearsOfService = (int) (Math.random() * 15);
            employees[i][0] = salary;
            employees[i][1] = yearsOfService;
        }

        return employees;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employees) {
        double[][] updatedEmployees = new double[10][3];

        for (int i = 0; i < 10; i++) {
            double oldSalary = employees[i][0];
            int yearsOfService = (int) employees[i][1];
            double bonus = 0;

            if (yearsOfService > 5) {
                bonus = 0.05 * oldSalary;
            } else {
                bonus = 0.02 * oldSalary;
            }

            double newSalary = oldSalary + bonus;

            updatedEmployees[i][0] = newSalary;
            updatedEmployees[i][1] = bonus;
            updatedEmployees[i][2] = oldSalary;
        }

        return updatedEmployees;
    }

    public static void calculateAndDisplayTotals(double[][] updatedEmployees) {
        double sumOldSalary = 0, sumNewSalary = 0, totalBonus = 0;

        System.out.println("Employee | Old Salary | New Salary | Bonus");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedEmployees[i][2];
            double newSalary = updatedEmployees[i][0];
            double bonus = updatedEmployees[i][1];

            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%8d | %.2f | %.2f | %.2f\n", i + 1, oldSalary, newSalary, bonus);
        }

        System.out.println("---------------------------------------------");
        System.out.printf("Total    | %.2f | %.2f | %.2f\n", sumOldSalary, sumNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        double[][] employees = generateSalariesAndYearsOfService();
        double[][] updatedEmployees = calculateBonusAndNewSalary(employees);
        calculateAndDisplayTotals(updatedEmployees);
    }
}
