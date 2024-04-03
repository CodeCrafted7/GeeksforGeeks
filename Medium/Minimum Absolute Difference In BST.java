class Solution
{
    
    int absolute_diff(Node root)
    {
        //Your code here
        
        min=Integer.MAX_VALUE;
        prev=-1;
        
        inorder(root);
        
        return min;
    }
    
    int min,prev;
    
    
    void inorder(Node root)
    {
        if(root!=null)
        {
            
            
            inorder(root.left);
            
            if(prev==-1)
            {
                prev=root.data;
            }
            else
            {
                min=Math.min(min,root.data-prev);
                prev=root.data;
            }
            
            inorder(root.right);
        }
    }
    
}
