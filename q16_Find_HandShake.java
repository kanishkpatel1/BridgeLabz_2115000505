import java.util.*;
public class q16_Find_HandShake {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int cmb=(n*(n-1)/2);
    System.out.println("The possible number of handshakes are "+cmb);
   } 
}
