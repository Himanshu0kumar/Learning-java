package LinkedList.CircularLL;

public class CLL {
    
    private Node head;
    private Node tail ;

    public CLL(){
        this.head = null ;
        this.tail = null ;
    }
    // This is a method to insert a values in the given likedList 
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node ;
            tail = node ;
            return ;
        }
        tail.next = node ;
        node.next = head ;
        tail = node ; 
    }
    // This is a methods to delete a particular value 
    public void delete (int value){
        Node node = head ;
        if(node == null){
            return;
        }
        if(node.val == value){
            head = head.next ;
            tail.next = head ;
            return;
        }
        do{
            Node n = node.next ;
            if(n.val == value){
                node.next = n.next ;
                break;
            }
            node = node.next ;
        }while(node != head);
    }
    // this the function of display the likedList
    public void display(){
        Node node = head ;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next ;
            }while(node !=head);
        }
        System.out.println("head");
    }
    
    private class Node {
        int val ; 
        Node next ;

        public Node(int val){
            this.val = val;
        }
    }

    /************************** Questions ************************************/

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
    // find the node from where the cycle node start 
    public class CycleQuestions{
        public Node hasCycle(Node head){
            int length = 0 ;
            Node fast = head ;
            Node slow = head ;
            
            while(fast != null && fast.next == null){
                fast = fast.next.next ;
                slow = slow.next;
                if(fast == slow){
                     length = LengthOfCycle(slow);
                     break ;
                }
            }
            // find the start node 

            Node first = head ;
            Node second = head ;

            while(length > 0){
                second = second.next ;
                length -- ;
            }

            // keep moving both forword and they will move at cycle start 

            while( first != second){
                first = first.next ;
                second = second.next ;
            }
            return second ;
        }
    }

    // Q-7. find a happy Number [leetcode problem 202]

    public boolean isHappy(int n){
        int slow = n ; 
        int fast = n ;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);

        if(slow == 1){
            return true ;
        }
        return false ;
    }
    private int findSquare(int number){
        int ans = 0 ;

        while(number > 0){
            int rem = number % 10 ;
            ans += rem*rem ;
            number /= 10 ;
        }
        return ans ;
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

}
