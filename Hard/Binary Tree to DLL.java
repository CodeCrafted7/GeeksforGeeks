class Solution
{
    Node head = null,lastnode = null;
   
    public void help(Node root){
        if(root == null)
            return;
            
            
        help(root.left);
        
        if(head == null)
            head = root;
        if(lastnode != null) lastnode.right = root;
        root.left = lastnode;
        lastnode = root;
        
        
        help(root.right);
    }
    
    Node bToDLL(Node root)
    {
	    help(root);
	    return head;
    }
}
