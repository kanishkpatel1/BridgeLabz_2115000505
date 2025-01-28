import java.util.Scanner;
public class q10_DivideChoclates {
    public static int[] findRemainderAndQuotient(int N, int M) {
        int childChocl=N/M;
        int remainingCholate=N%M;
        int []res=new int[2];
        res[0]=childChocl;
        res[1]=remainingCholate;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of chocolates");
        int N=sc.nextInt();
        System.out.println("Enter the number of children");
        int M=sc.nextInt();
        int result[]=findRemainderAndQuotient(N, M);
        System.out.println("Number of choclates each students get "+result[0]+" amd remaining numbe of chocolates "+result[1]);
        sc.close();


    }
    
}
