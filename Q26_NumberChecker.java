import java.util.*;

public class Q26_NumberChecker {
    static int countDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    static int[] digitArray(int n){
        int t=countDigit(n);
        int arr[]=new int[t];
        while(n>0){
            arr[--t]=n%10;
            n/=10;
        }
        return arr;
    }

    static boolean checkArmstrong(int n){
        int c=n;
        int digit=countDigit(n);
        int temp=0;
        while(n!=0){
            int di=n%10;
            int curr=(int)Math.pow(di, digit);
            temp+=curr;
            n/=10;
        }
       
      return temp==c;
    }
    static int [] largestAndSecondlargest(int arr[]){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first) {
                second=first;
                first=arr[i];
            }
        }
        return new int[] {first,second};
    }
    static int [] smallestAndSecondsmallest(int arr[]){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<first) {
                second=first;
                first=arr[i];
            }
        }
        return new int[] {first,second};
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int digitArr[]=digitArray(n);
        System.out.println("Dgits in this number are "+countDigit(n));
        System.out.println("Dgits array is "+Arrays.toString(digitArr));
        System.out.println("check Armstrong "+checkArmstrong(n));
        int l=largestAndSecondlargest(digitArr)[0];
        int sl=largestAndSecondlargest(digitArr)[1];
        System.out.println("Largest element is "+l +" and second largest element is "+sl);
        int s=smallestAndSecondsmallest(digitArr)[0];
        int ss=smallestAndSecondsmallest(digitArr)[1];
        System.out.println("Smallest element is "+s +" and second smallest is "+ss);
    }
}
