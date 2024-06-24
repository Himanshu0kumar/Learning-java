package Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        // CustomQueue queue = new CustomQueue(5);

        CircularQueue queue = new CircularQueue(5);

        queue.insert(5);
        queue.insert(1);
        queue.insert(9);
        queue.insert(3);

        queue.display();

        System.out.println(queue.remove());

        queue.insert(24);
        queue.display();

        System.out.println(queue.front());

        // System.out.println(queue.rear());
        
    }
}
