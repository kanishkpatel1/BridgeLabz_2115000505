import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r=sc.next();
        String f="";
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(!str[i].equals(r)){
                f+=str[i];
                f+=" ";
            }
        }
        System.out.println(f);
    }
}
