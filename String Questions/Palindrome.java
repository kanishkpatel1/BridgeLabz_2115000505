import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                System.out.println("Not palindrome");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
    }
}
