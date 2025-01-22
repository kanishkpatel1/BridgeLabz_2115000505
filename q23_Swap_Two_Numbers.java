import java.util.*;
public class q23_Swap_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("The swapped numbers are "+a+" and "+b);
    }
}
