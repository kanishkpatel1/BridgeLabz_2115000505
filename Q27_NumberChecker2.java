import java.util.*;

public class Q27_NumberChecker2 {
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

    static int digitSum(int arr[]){
        int sum=0;
        for(int d:arr) sum+=d;
        return sum;
    }

    static int digitSumSquare(int arr[]){
        int sum=0;
        for(int d:arr) sum+=Math.pow(d,2);
        return sum;
    }

    static boolean checkHarshad(int n){
        int digit=n;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
       
      return (digit%sum==0);
    }
    
    static int[] findFreq(int a[]){
        int arr[]=new int[10];
        for(int d:a){
            arr[d]++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int digitArr[]=digitArray(n);
        System.out.println("Dgits in this number are "+countDigit(n));
        System.out.println("Dgits array is "+Arrays.toString(digitArr));
        System.out.println("check Harshad "+checkHarshad(n));
        System.out.println("Sum of digits in digit array is "+digitSum(digitArr));
        System.out.println("Sum of squares of digits in digit array is "+digitSumSquare(digitArr));
        int arr[]=findFreq(digitArr);
        for(int i=0;i<10;i++){
            if(arr[i]!=0){
                System.out.println("Frequenchy of digit "+i+" is " +arr[i]);
            }
        }
    }
}
