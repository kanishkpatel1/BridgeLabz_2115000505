import java.util.Scanner;

public class q19_DoubleOperations {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();

    double operation1=a+b*c;
    double operation2=a*b+c;
    double operation3=c+a/b;
    double operation4=a%b+c;
    System.out.println("The result of Int Operations are "+operation1+" , "+operation2+" , "+operation3+" and "+operation4);
 
    }
}
