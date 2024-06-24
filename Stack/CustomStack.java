package Stack;

public class CustomStack {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10; 
    
    int ptr = -1 ;

    public CustomStack(){
        this(DEFAULT_SIZE); // 
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    // this is a method to push the item in the stack
    public boolean push(int item){

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item ; 
        return true ;
    }
    // this is a method to check stack is full or not 
    public boolean isFull() {
        return ptr == data.length -1 ; // ptr is at last index 
    }
    // this is a method to check stack is empty or not 
    public boolean isEmpty(){
        return ptr == -1 ; // when ptr is at -1 index 
    }
    // this is a method to pop the item from the stack 

    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Can't pop from an empty stack!!");
        }
        // int removed = data[ptr];
        // ptr-- ;
        // return removed;
        return data[ptr--];
    }

    // This is a method to check the top of the Elements 
    public int peek()throws Exception{ 
        if(isEmpty()){ 
            throw new Exception("Can't peek from an empty stack!!");
        }
        return data[ptr]; 
    }
}
