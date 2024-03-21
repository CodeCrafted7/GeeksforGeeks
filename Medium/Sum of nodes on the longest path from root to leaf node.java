
class Solution{
    
    class pair{
        int data;
        int height;
        
        public pair(int data ,int height)
        {
            this.data=data;
            this.height=height;
        }
    }
    
    public pair solve(Node root)
    {
        if(root==null)
            return new pair(0,0);
        
        pair left=solve(root.left);
        pair right=solve(root.right);
        
        if(left.height==right.height)
            return new pair(Math.max(left.data,right.data)+root.data,left.height+1);
        else if(left.height>right.height)
            return new pair(left.data+root.data,left.height+1);
        else
            return new pair(right.data+root.data,right.height+1);
    }
    
    public int sumOfLongRootToLeafPath(Node root)
    {
        return solve(root).data;
    }
}
