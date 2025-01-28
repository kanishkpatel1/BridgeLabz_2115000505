import java.util.Scanner;
public class q08_FindSmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int[] result = new int[2];
        result[0] = Math.min(Math.min(number1, number2), number3);
        result[1] = Math.max(Math.max(number1, number2), number3);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:- ");
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest number is :"+result[0]+" and Largest number is : "+result[1]);
        sc.close();
    }
    
}
