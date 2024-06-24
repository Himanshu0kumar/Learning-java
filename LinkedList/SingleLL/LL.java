package LinkedList.SingleLL;

// import java.util.List;

public class LL {

    private Node head ; 
    private Node tail ;

    private int size ; 

    public LL(){
        this.size = 0 ;
    }

    // insert a node at very first 
    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head ;
        head = node ;
        
        if(tail == null){
            tail = head ; 
        }
        
        size +=1 ;
    }
    // Insert a node at the last position in the list 
    public void InsertLast(int val){
        if(tail == null){
            InsertFirst(val);
            return ;
        }
        Node node = new Node(val);  // creating a box 
        tail.next = node ; 
        tail = node ;
        size++ ;
    }
    // insert a node at a perticular index 
    public void insert(int value , int index){
        if(index == 0){
            InsertFirst(value);
            return;
        }
        if(index == size){
            InsertLast(value);
            return;
        }

        Node temp = head ;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(value , temp.next);
        temp.next = node ;
        size++ ;
    }
    // Deleting the first element from the node 
    public int deleteFirst(){
        int val = head.value;
        head = head.next ;
        if(head == null){
            tail = null ;
        }
        size-- ; 
        return val;
    }
    // delete the last node 
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size -2); // it will give me the point secondLast node
        int val = tail.value;
        tail = secondLast;
        tail.next = null ;
        return val ;
    }
    // delete a perticulat index 
    public int delete(int index){
        if(index == 0 ){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }

        Node pre = get(index - 1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        return val ;
    }
    //  now if you put any number that will return you reference pointer to that node 
    public Node get(int index){
        Node node = head ;
        for (int i = 0; i < index; i++) {
            node = node.next ;
        }
        return node ;
    }
    // find a node in the given list 
    public Node find(int value){
        Node node = head ;
        while(node != null){
            if(node.value == value){
                return node ;
            }
            node = node.next ;
        }
        return null ;
    }
    // Display the node 
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +" -> ");
            temp = temp.next ;
        }
        System.out.print("End");
    }

     // creating node and whom its pointing 
    private class Node{
        private int value ;
        private Node next ; 

        // This is the constructor which is taking only value
        public Node(int value){
            this.value = value;
        }
        // This is another constructor which is taking value as well as next also 
        public Node(int value , Node next){
            this.value = value ;
            this.next = next;
        }
    }

    /********************************** Questions *****************************/

    // Q-1. This is a method to remove the Duplicates Node from the sorted list 

    public void Duplicates(){
        Node node = head ;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
            }
            else{
                node = node.next ;
            }
        }
        tail = node ;
        tail.next = null ;
    }

    // Q-2. Merge two sorted list 

    public static LL merge(LL first , LL second){

        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null){
            if(f.value < s.value){
                ans.InsertLast(f.value);
                f = f.next ;
            }
            else{
                ans.InsertLast(s.value);
                s = s.next ;
            }
        }
        while( f != null){
            ans.InsertLast(f.value);
            f = f.next ;
        }
        while( s != null){
            ans.InsertLast(s.value);
            s = s.next ;
        }
        return ans ;
    }
    // Q-3. Cycle dection in the liked list 
    public boolean CycleDetection(Node head){
        Node fast = head;
        Node slow = head ;

        while(fast != null && fast.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
            if(fast == slow){
                return true ;
            }
        }
        return false;
    }

    //  Q-4. Find the length of the cycle 
    public int LengthOfCycle(Node head){
        Node fast = head;
        Node slow = head ;

        while(fast != null && fast.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
            if(fast == slow){
                // calculate the length 
                Node temp = slow ;
                int length = 0 ;
                do{
                    temp = temp.next ;
                    length++;
                }while(temp != slow);
                return length ;
            }
        }
        return 0;
    }
    // Q-8. find the middle of th Linked List in a single pass only 

    public Node middleNode(Node head){
        Node slow = head ;
        Node fast = head; 

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }
    // Q-11  Revese a linked list using itration 
    public void ReverseNode(){
        if(size < 2){
            return ;
        }

        Node prev = null ;
        Node present = head ;
        Node next = present.next ;

        while(present != null ){
            present.next = prev ;
            prev = present ;
            present = next ;
            if(next != null){
                next = next.next ;
            }
        }
         head = prev ;
    }

    // Q-12. Reverse a linked list only a partiluar part 

    public Node reversBetween(Node head , int left , int right){
        if(left == right){
            return head ;
        }

        // skiped the first left - 1 node 

        Node current = head ;
        Node prev = null ;
        
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current ;
            current = current.next ;
        }
        Node last = prev ;
        Node newEnd = current ; 

        // reverse between left and right 
         Node next = current.next ;
        for (int i = 0; current != null && i < right - left +1; i++) {
            current.next = prev ;
            prev = current ;
            current = next ;
            if(next != null){ 
                next = next.next ;
            }
        }
        if(last != null){
            last.next = head ;
        }
        else {
            head = prev;
        }

        newEnd.next = current ;
        return head ;
    }

    // Q-13. palindrome linked list 

    // public boolean isPalindrom(Node head){
    //     Node mid = middleNode(head);
    //     Node headSecond = ReverseNode();
    // }

    public static void main(String[] args) {
        LL list = new LL();

        list.InsertLast(1);
        list.InsertLast(1);
        list.InsertLast(1);
        list.InsertLast(2);
        list.InsertLast(4);
        list.InsertLast(4);

        list.display();
        System.out.println();

        // 
        list.ReverseNode();

        list.display();
        
        // Question Number 2 

        // list.Duplicates();
        // System.out.println("After Removing duplicates Nodes");
        // list.display();
        
        // LL first = new LL();
        // LL second = new LL();

        // // first list
        // first.InsertLast(1);
        // first.InsertLast(3);
        // first.InsertLast(5);

        // // second list 
        // second.InsertLast(1);
        // second.InsertLast(2);
        // second.InsertLast(9);
        // second.InsertLast(14);

        // LL ans = LL.merge(first, second);
        // ans.display();

        // Question Number - 3
        
        System.out.println(list.CycleDetection(null));

        // Question Number -4 
        System.out.println(list.LengthOfCycle(null));
    }

   
}
