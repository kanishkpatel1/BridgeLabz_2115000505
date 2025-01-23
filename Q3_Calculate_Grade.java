import java.util.*;
public class Q3_Calculate_Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Physics, Chemistry and Math ");
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int math=sc.nextInt();
        double average=(physics+chemistry+math)/3;
        double percentage=average/10;
        if(percentage>=8) {
            System.out.println("Average marks is "+ average+" Grade is A and remarks is Level 4 above agency-normalized standards");
        }
        else if(percentage>=7){
            System.out.println("Average marks is "+ average+" Grade is B and remarks is Level 3, at agency-normalized standards");
        }
        else if(percentage>=6){
            System.out.println("Average marks is "+ average+" Grade is C and remarks is Level 2, below, but approaching agency-normalized standards");
        }
        else if(percentage>=5){
            System.out.println("Average marks is "+ average+" Grade is D and remarks is Level 1, well below agency-normalized standards");
        }
        else if(percentage>=4){
            System.out.println("Average marks is "+ average+" Grade is E and remarks is Level 1-, too below agency-normalized standards");
        }
        else
            System.out.println("Average marks is "+ average+" Grade is R and remarks is Remedial standards");
    }

}
