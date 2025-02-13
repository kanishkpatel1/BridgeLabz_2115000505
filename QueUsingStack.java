import java.util.*;

public class QueUsingStack {

    static Stack<Integer> stk1 = new Stack<>();

    public static void add(int data) {
        Stack<Integer> stk2 = new Stack<>();
        while (!stk1.isEmpty()) {

            stk2.push(stk1.pop());
        }
        stk2.push(data);
        while (!stk2.isEmpty()) {
            stk1.push(stk2.pop());
        }
    }

    public int size() {
        return stk1.size();
    }

    public void display() {
        while (!stk1.isEmpty()) {
            System.out.println(stk1.pop());
        }
    }

    public int remove() {
        if (stk1.isEmpty()) {
            return -1;
        }
        return stk1.pop();
    }

    public int peek() {
        return stk1.peek();
    }

    public static void main(String[] args) {
        QueUsingStack s = new QueUsingStack();
        s.add(1);
        s.add(2);
        s.add(3);
        // s.display();
        s.remove();
        System.out.println();
        System.out.println("element at front is : " + s.peek());
        s.display();

    }
}
