import java.util.HashMap;
import java.util.Scanner;

public class FrequentChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char frequent=' ';
        int min=Integer.MIN_VALUE;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hs.containsKey(ch)){
                hs.put(ch, hs.get(ch)+1);
            }
            else{
                hs.put(ch,1 );
            }
        }
        for(char c:hs.keySet()){
           if(hs.get(c)>min){
            min=hs.get(c);
            frequent=c;
           }
        }
        System.out.println(frequent);
    }
}
