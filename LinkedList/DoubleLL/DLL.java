package LinkedList.DoubleLL;

public class DLL {
   private Node head ;
    // it will add the node at first index 
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head ;
        node.prev = null ;
        if(head != null){
            head.prev = node ;
        }
        head = node ;
    }
    // it will insert the node at the last index while tail is not given 

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head ;
        node.next = null ;
        if(head.next == null){
            node.prev = null ;
            head = node ;
        }
        while(last.next != null){
            last = last.next ;
        }
        last.next = node ;
        node.prev = last ;
    }
    // find a particular node 
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node ;
            }
            node = node.next ;
        }
        return null ;
    }
    // insert a node at a perticular value 
    public void insert(int after , int value){
        Node p = find(after);
        if(p == null){
            System.out.println("Does not exit");
            return;
        }
        Node node = new Node(value);
        node.next = p.next ;
        p.next = node;
        node.prev = p ;
        if(node.next != null ){
            node.next.prev = node ;
        } 
    }

    // it will display the liked list 
    public void display(){
        Node node = head ;  // here we are taking "node" because its not changing the struture of the node 
        Node last = null ;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node ;
            node = node.next;
        }
        System.out.println("End");
        // it will reverse the list 
        System.out.println("print in reverse");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

   private class Node{
        int val;
        Node next ;
        Node prev ;

        public Node(int val){
            this.val = val; 
        }
        // public Node(int val , Node next , Node prev){
        //     this.val = val ;
        //     this.next = next ;
        //     this.prev = prev ;
        // }

   }
}
