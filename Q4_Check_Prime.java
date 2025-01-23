import java.util.*;
public class Q4_Check_Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
                System.out.println(n+" is Not a prime number");
                break;
            }
        }
        if(count==0) System.out.println(n+" is a prime number");
    }
}
