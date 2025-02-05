class Solution {
    int  ans = 0;
    int diameter(Node root) {
        fun(root);
        return ans;
    }
    public  int fun(Node root){
        if(root == null)
            return 0;
        int l = fun(root.left);
        int r = fun(root.right);
        ans = Math.max(ans,l+r);
        return Math.max(l,r)+1;
    }
}
