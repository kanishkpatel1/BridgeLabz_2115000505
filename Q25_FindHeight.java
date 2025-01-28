import java.util.*;
public class Q25_FindHeight{
    static int sumAll(int arr[]){
        int res=0;
        for(int i= 0;i<arr.length;i++){
            res+=arr[i];
        }
        return res;
    }

    static double meanHeight(int arr[]){
        int res=0;
        for(int i= 0;i<arr.length;i++){
            res+=arr[i];
        }
        return res/arr.length;
    }
    static int smallestHeight(int arr[]){
        int res=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            res=Math.min(res, arr[i]);
        }
        return res;
    }
    static int tallesttHeight(int arr[]){
        int res=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            res=Math.max(res, arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Random r=new Random();
        int arr[]=new int[11];
        for(int i=0;i<arr.length;i++){
            arr[i]=150+r.nextInt(101);
        }
        int sm=smallestHeight(arr);
        int tl=tallesttHeight(arr);
        double mn=meanHeight(arr);
        System.out.println("Heights of all players are "+Arrays.toString(arr));
        System.out.println("shortest height is "+sm+" tallest height is "+tl+" mean height is "+mn);

    }
}