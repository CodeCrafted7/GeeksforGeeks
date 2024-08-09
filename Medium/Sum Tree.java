/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public static int solve(Node root){
        if(root==null)
            return 0;
            
        if(root.left==null && root.right==null)
            return root.data;
            
        int l = solve(root.left);
        int r = solve(root.right);
        if(l+r != root.data)
            return -9999;
        return l+r+root.data;
    }
    
    boolean isSumTree(Node root) {
        if(solve(root.left)+solve(root.right)==root.data)   return true;
        return false;
    }
}
