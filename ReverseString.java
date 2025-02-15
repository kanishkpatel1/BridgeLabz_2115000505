import java.util.*;
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Original String is: "+str);
        StringBuilder sb=new StringBuilder(str);
        str=sb.reverse().toString();
        System.out.println("Reversed string is: "+str);
    }
}