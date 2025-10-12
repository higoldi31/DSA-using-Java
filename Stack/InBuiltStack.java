package Stack;

import java.util.Stack;

public class InBuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        
        stack.push(3);
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(14);
        stack.push(19);

        System.out.println(stack.pop());//removes the topmost element
        System.out.println(stack.peek());//retrieves the topmost element
        System.out.println(stack.size());//returns the size
    }
}
