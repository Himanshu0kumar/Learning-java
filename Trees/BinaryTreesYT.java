package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesYT {
    
    static class Node{
        int data ;
        Node left ; 
        Node right ;

        public Node(int data) {
            this.data = data;
            this.left = null ; 
            this.right = null ;
        }
    }

    static class BinaryTree{
        static int idx = -1 ;
        public static Node BuildTree(int nodes[]){
             idx++;
             if(nodes[idx] == -1){
                return null;
             }
             // create a new node which hava left and right child 
             Node newNode = new Node(nodes[idx]);
             newNode.left = BuildTree(nodes);
             newNode.right = BuildTree(nodes);

             return newNode ;
        }
    }

    // preorder traversal 
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    // inorder traversal 

    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    // postorder traversal 

    public static void postorder(Node root ){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    // level order traversal 

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();

        // add the node 

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            if(root == null){
                return;
            }
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.println(currNode.data + " ");
            if(currNode.left != null)
                q.add(currNode.left);
            }
            if(currNode.right != null){
                q.add(currNode.right);
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.BuildTree(nodes);
        // System.out.println(root.data);   // it will return the root node of the tree

        // inorder(root);

        levelOrder(root);
    }
}
