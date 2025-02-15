import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        
        HashSet<Character> hs=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(!hs.contains(ch)){
                sb.append(ch);
                hs.add(ch);
            }
            
        }
        System.out.println("Original String: "+str);
        System.out.println("String without repetitions: "+sb.toString());
    }


}
