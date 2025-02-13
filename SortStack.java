import java.util.*;
public class SortStack {

    public static void sort(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int x=s.pop();
        sort(s);
        Stack<Integer> temp=new Stack<>();
        while(!s.isEmpty() && x<s.peek()){
            temp.push(s.pop());
        }
        s.push(x);
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }

    }
    
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();

        stk.add(5);
        stk.add(8);
        stk.add(1);
        stk.add(9);
        sort(stk);
        System.out.println(stk);

        
}
}
