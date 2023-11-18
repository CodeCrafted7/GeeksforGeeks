//User function Template for Java
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution { 
    static Node pivot = null;
    
    Node bTreeToClist(Node root) {
        inOrder(root);
        
        Node head = root;
        Node tail = root;
        
        while(head.left != null) {
            head = head.left;
        }
        while(tail.right != null) {
            tail = tail.right;
        }
        
        head.left = tail;
        tail.right = head;
        

        pivot = null;
        return head;
    }
    
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        
        inOrder(root.left);
        
        if(pivot != null) {
            pivot.right = root;
            root.left = pivot;
        }
        pivot = root;
        
        inOrder(root.right);
    }
}
