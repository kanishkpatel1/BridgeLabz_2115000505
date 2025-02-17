public class Fibonacci {
    public static int fibonacciRecursive(int n){
        if(n<=2) return 1;
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);

    }
    public static int fibonacciIterative(int n){
        int a=0;
        int b=1;
        int sum=0;
        for(int i=2;i<=n;i++){
        
            
            sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
    public static void fibo(int n){
        System.out.println("Time take for the value of n : "+n);
        long time1=System.nanoTime();
        int result=fibonacciRecursive(n);
        long time2=System.nanoTime();
        System.out.println("Time taken by recursive method : "+(time2-time1)/1e6+" miliseconds");
        long time3=System.nanoTime();
        int result2=fibonacciIterative(n);
        long time4=System.nanoTime();
        System.out.println("Time taken by iterative method : "+(time4-time3)/1e6+" miliseconds");
    }
    public static void main(String[] args) {
    
        fibo(10);
        fibo(30);
        //fibo(50);
        
    }
}
