import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Stackreverse(s);
        printStack(s);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void Stackreverse(Stack<Integer> s){
        while(s.isEmpty()){
            return;
        }
        int top = s.pop();
        Stackreverse(s);
        pushAtBottom(s, top);
    }
}
