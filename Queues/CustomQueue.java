package Queues;

public class CustomQueue {
    
    private int[] data ;

    private static final int DEFAULT_SIZE = 10 ;

    int end = 0;

    public CustomQueue() {
      this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    
    public boolean isFulll(){
        return end == data.length  ; // the ptr is at the last index 
    }

    public boolean isEmpty(){
        return end == 0 ;
    }

    // this is method to insert an element in the queue 

    public boolean insert(int item){
        if(isFulll()){
            System.out.println("the Queue is full");
            return false ;
        }
        data[end++] = item ; 
        return true ;
    }
    
    // this is a method to remove an elements from the queue 

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("The Queue is Empty");
        }

        int removed = data[0]; // remove the first element 

        // shift the other element by one to the left 
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end-- ;  // now drease the size by one 
        return removed ;
    }

    // This is a method to show the front Element in the Queue 
    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("The Queue is Empty");
        }
        return data[0]; 
    }

    public int rear(){
        return data[end];
    }
    // This is a method to show all the Elements present in the Queue 

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("End");
    }
}
