package Stack;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(20);
        stack.push(4);
        stack.push(45);
        stack.push(70);
        stack.push(52);

        System.out.println(stack.pop()); // now the 52 will be removed from the stack 
        
        
        
    }
}
