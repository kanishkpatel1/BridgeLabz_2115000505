import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String f="";
        char ch=sc.next().charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                f+=s.charAt(i);
            }
        }
        System.out.println(f);
    }
}
