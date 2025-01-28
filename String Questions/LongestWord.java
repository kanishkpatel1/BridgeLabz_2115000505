import java.util.Arrays;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String longest="";
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].length()>longest.length()){
                longest=str[i];
            }
        }
        System.out.println("Longest word is :"+longest);
    }
}
