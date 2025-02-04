import java.util.*;

class Employee {
    static String companyName;
    String name;
    final int id;
    String designation;
    static int totalEmployee = 0;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployee);
    }

    void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
}

public class Q03_EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Company Name: ");
        Employee.companyName = sc.nextLine();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Employee " + i + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();

            Employee emp = new Employee(name, id, designation);
            employees.add(emp);
        }
        
        for (Employee emp : employees) {
            if (emp instanceof Employee) {
                emp.displayEmployeeDetails();
            }
        }

        Employee.displayTotalEmployees();
        sc.close();
    }
}
