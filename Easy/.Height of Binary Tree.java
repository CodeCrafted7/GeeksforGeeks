class Solution {
   
    int height(Node node) {
       if(node == null)
        return -1;
        
        int l = height(node.left);
        int r = height(node.right);
        return Math.max(l,r)+1;
    }
}
