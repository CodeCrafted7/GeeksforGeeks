
class Tree
{
    

    boolean isBalanced(Node root)
    {
	return dfs(root) != -1;
    }
    
    int dfs(Node root)
    {
     if(root==null) return 0;
        
        int lh = dfs(root.left);
        if(lh==-1) return -1;
        int rh = dfs(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return 1+Math.max(lh,rh);
    }
    
}
