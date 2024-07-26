

// User function Template for Java

class Solution {
    public Node bst(int inorder[],int s,int e){
        if(s>e)
            return null;
        int m =  (s+e)/2;
        Node node  = new Node(inorder[m]);
        node.left = bst(inorder,s,m-1);
        node.right = bst(inorder,m+1,e);
        return node;
    }
    public Node sortedArrayToBST(int[] nums) {
       Node root = bst(nums,0,nums.length-1);
       return root;
    }
}
