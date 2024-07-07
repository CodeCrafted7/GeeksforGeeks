
// User function Template for Java

/*
class Node {
    int data;
    Node left, right,next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    Node nxt = null;
    public void populateNext(Node root) {
        
        if(root==null)
            return;
            
        populateNext(root.right);
        root.next=nxt;
        nxt=root;
        populateNext(root.left);
    }
}
