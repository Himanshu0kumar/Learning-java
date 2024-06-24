package Stack;

public class StackMain {
    public static void main(String[] args) throws Exception{
        
        // CustomStack stack = new CustomStack(5);
    
        // stack.push(9);
        // stack.push(4);
        // stack.push(12);
        // stack.push(45);
        // stack.push(22);
        // stack.push(70); // now it give an message that stack is full 


        // System.out.println(stack.pop());

        // System.out.println(stack.peek());

        DayanamicStack stacklist = new DayanamicStack();

        stacklist.push(19);
        stacklist.push(74);
        stacklist.push(89);
        stacklist.push(60);
        stacklist.push(10);
        stacklist.push(20);

        // now it will not give any message that array is full because it is dynamic stack

        System.out.println(stacklist.pop());
        System.out.println(stacklist.pop());
        System.out.println(stacklist.pop());
        System.out.println(stacklist.pop());
        System.out.println(stacklist.pop());
        System.out.println(stacklist.pop());

        
    }

}
