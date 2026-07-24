import java.util.Stack;
public class StringStack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
