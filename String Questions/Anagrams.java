import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length){
            System.out.println("Not anagrams");
        }
        else{
            if(Arrays.equals(arr1, arr2)){
                System.out.println("Are anagrams");
            }
            else{
                System.out.println("Not anagrams");
            }
        }
    }
}
