package LinkedList.DoubleLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(9);
        list.insertFirst(6);
        list.insertFirst(10);
        list.insertFirst(22);
        list.insertFirst(7);
        list.insertLast(80);

        list.display();
        list.insert(10, 23);

        list.display();
        
    }
}
