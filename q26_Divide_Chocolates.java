import java.util.*l
public class q26_Divide_Chocolates {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int numberOfchocolates=sc.nextInt();
        int numberOfChildren=sc.nextInt();
        int res=numberOfchocolates/numberOfChildren;
        int rem=numberOfchocolates%numberOfChildren;

        System.out.println("The number of chocolates each child gets is "+res+" and the number of remaining chocolates are "+rem);
    }
}

