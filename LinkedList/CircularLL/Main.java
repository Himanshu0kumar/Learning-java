package LinkedList.CircularLL;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);

        list.delete(19);
        
    
        list.display();

        // Question number - 7
        System.out.println(list.isHappy(12));

        
    }
}
