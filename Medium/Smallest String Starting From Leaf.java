/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String smallestFromLeaf(TreeNode root) {
        List<String> li=new ArrayList<>();
        smallestFromLeaf(root,li,"");
        Collections.sort(li);
        return li.get(0);
    }
    public void smallestFromLeaf(TreeNode root,List<String> li, String val){
        if(root==null){
            return;
        }
        val=(char)(root.val+97)+val+"";
        if(root.left==null && root.right==null){
            li.add(val);
            return;
        }
        smallestFromLeaf(root.left,li,val);
        smallestFromLeaf(root.right,li,val);
    }
}
