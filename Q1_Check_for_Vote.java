import java.util.*;
public class Q1_Check_for_Vote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the age of Student "+i+1);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) System.out.println("Invalid Age ");
            else if(arr[i]>=18){
                System.out.println("The student with the age "+arr[i]+" can vote");

            }
            else if(arr[i]<15)  System.out.println("The student with the age "+arr[i]+" can't vote");
        }
    }
}