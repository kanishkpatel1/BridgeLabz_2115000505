import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        
        int arr[]={100, 80, 60, 70, 60, 75, 85};
        int res[]=new int[arr.length];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[i]>=arr[stk.peek()]){
                stk.pop();
            }
            if(!stk.isEmpty())
                res[i]=i-stk.peek();
            else if(stk.isEmpty()) 
                res[i]=i+1;
            else
                res[i]=1;
            stk.push(i);
        }
        System.out.println(Arrays.toString(res));

    }
}
