import java.util.Stack;
public class ReverseStringexamp {
    public static void main(String[] args) {
        String s="string";
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
    
}
