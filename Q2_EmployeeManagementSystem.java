class Employee{
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name of the employee is "+name+ " salary is "+salary +" id is"+id);
     }
}

class Manager extends Employee{
 int teamSize;
 Manager(String name,int id, int salary, int teamSize){
    super(name, id, salary);
    this.teamSize=teamSize;
 }
 @Override
 public void displayDetails(){
    super.displayDetails();
    System.out.println( " team size is "+teamSize);
 }
}

class Developer extends Employee{
    String programmingLanguage;
    public Developer(String name, int id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;

    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println( " programming language  is "+programmingLanguage);
     }
}

class Intern extends Employee{
    String programmingLanguage;
    public Intern(String name, int id, int salary){
        super(name, id, salary);
        

    }
    @Override
    public void displayDetails(){
        super.displayDetails();
     }
}
public class Q2_EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee=new Employee("Ashish", 1, 10000);
        employee.displayDetails();
        Manager manager=new Manager("Shivam", 2, 30000, 15);
        Developer developer=new Developer("Rahul",3, 200000, "python");
        Intern intern=new Intern("Ayush", 4, 15000);
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
