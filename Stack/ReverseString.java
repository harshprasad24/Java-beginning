import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(reverse(s));
    }
    public static String reverse(Stack<String> s){
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
}

// to take inut in stack
// Stack<Character> c = new Stack<>();
//         int indx =0 ;
//         while(indx<Str.length()){
//             c.pusp(Str.charAt(indx));
//             indx++;
//         }