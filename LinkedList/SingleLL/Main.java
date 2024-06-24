package LinkedList.SingleLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(2);
        list.InsertFirst(8);
        list.InsertFirst(17);

        list.InsertLast(99);

        list.insert(100, 3);

        list.deleteFirst();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

        // list.display();
    }
}
