import java.util.*;
public class Q29_FindBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the salary of the employee: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter the years of service of the employee: ");
        int yearsOfService = sc.nextInt();
        
        double bonus = 0.0;
        
        if (yearsOfService > 5) {
            bonus = salary * 0.05; 
        }
        
        System.out.println("Bonus amount: " + bonus);
    }
}
