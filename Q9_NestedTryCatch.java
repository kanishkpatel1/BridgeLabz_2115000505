import java.util.*;
public class Q9_NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4};
        System.out.println("Enter the index to access ");
        int ind=sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor=sc.nextInt();

        try{
            int num=arr[ind];

            try{
                System.out.println(num/divisor);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception "+e.getMessage());
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index "+ e.getMessage());
        }
        
    }
}
