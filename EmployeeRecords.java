import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize employee details
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to access and modify salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    // Constructor to initialize manager details
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Employee details
        System.out.print("Enter Employee ID: ");
        int empID = sc.nextInt();
        sc.nextLine();  // Consume newline left-over
        System.out.print("Enter Employee Department: ");
        String empDept = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(empID, empDept, empSalary);
        employee.displayEmployeeDetails();

        // Modify salary using public method
        System.out.print("Enter the new salary for the employee: ");
        double newSalary = sc.nextDouble();
        employee.setSalary(newSalary);
        System.out.println("\nUpdated Salary: " + employee.getSalary());

        // Input for Manager details
        System.out.print("\nEnter Manager ID: ");
        int managerID = sc.nextInt();
        sc.nextLine();  // Consume newline left-over
        System.out.print("Enter Manager Department: ");
        String managerDept = sc.nextLine();
        System.out.print("Enter Manager Salary: ");
        double managerSalary = sc.nextDouble();

        // Create a Manager object
        Manager manager = new Manager(managerID, managerDept, managerSalary);
        manager.displayManagerDetails();
    }
}
