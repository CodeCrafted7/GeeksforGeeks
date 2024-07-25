class Solution {
    // Function to check whether a Binary Tree is BST or not.
    void inorder(Node root,List<Integer>ans){
        if(root == null)
            return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
        
    }
    boolean isBST(Node root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)>=ans.get(i+1))
                return false;
        }
        return true;
    }
}
