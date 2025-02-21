import java.util.*;

public class Q4_MultipleCatch {
    public static void main(String[] args) {
        int arr[];
        
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size=sc.nextInt();
            

            arr = new int[size];
            System.out.println("Enter the index you want to access");
            int index=sc.nextInt();
            
            int value=arr[index];
            System.out.println("Value at index "+index+" is "+value);
        }
        catch(ArrayIndexOutOfBoundsException  e){
            System.out.println("Invalid Index "+e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Array is not initialized "+e.getMessage());
        }
    }
}
