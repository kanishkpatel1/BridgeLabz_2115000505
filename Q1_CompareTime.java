import java.util.*;
public class Q1_CompareTime{
    public static void main(String[] args) {
        System.out.println("Time taken by 1000 datasets");
        int arr1[]=new int[1000];
        for(int i=0;i<-1000;i++){
            arr1[i]=(int)(100*Math.random());
        }
        arr1[999]=100;
        long time5=System.nanoTime();
        int target3=100;
        for(int d:arr1){
            if(d==target3){
                System.out.println("Target found ");
            }
        }
        long time6=System.nanoTime();
        System.out.println("Time taken to search element: "+(time6-time5)/1e9+" s");

        
        Arrays.sort(arr1);
        long time7=System.nanoTime();
        int target2=100;
        int start=0;
        int end=arr1.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr1[mid]==target2){
                System.out.println("Target found ");
                break;
            }
            else if(arr1[mid]>target2){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        long time8=System.nanoTime();
        System.out.println("time taken by binary search is "+(time8-time7)/1e9+" s");


        System.out.println("Time for 1000000 datasets");
        int arr[]=new int[10000000];
        for(int i=0;i<-10000000;i++){
            arr[i]=(int)(100*Math.random());
        }
        arr[9999999]=100;
        long time1=System.nanoTime();
        int target=100;
        for(int d:arr){
            if(d==target){
                System.out.println("Target found ");
            }
        }
        long time2=System.nanoTime();
        System.out.println("Time taken to search element: "+(time2-time1)/1e9+" s");

        
        Arrays.sort(arr);
        long time3=System.nanoTime();
        int target1=100;
        int start1=0;
        int end1=arr.length-1;
        while(start1<end1){
            int mid=start1+(end1-start1)/2;
            if(arr[mid]==target1){
                System.out.println("Target found ");
                break;
            }
            else if(arr[mid]>target1){
                end1=mid-1;
            }
            else{
                start1=mid+1;
            }
        }
        long time4=System.nanoTime();
        System.out.println("time taken by binary search is "+(time4-time3)/1e9+" s");
    }
}