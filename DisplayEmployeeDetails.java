import java.util.*;
class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayEmployee(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);
    }
}
public class DisplayEmployeeDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the Employee");
        String name=sc.nextLine();
        System.out.println("Enter Id of the Employee");
        int id=sc.nextInt();
        System.out.println("Enter salary of the Employee");
        double salary=sc.nextDouble();
        Employee obj=new Employee(name, id, salary);
        obj.displayEmployee();
    }
}