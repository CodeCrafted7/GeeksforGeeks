
class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        sorting(root1,ans);
        sorting(root2,ans);
        Collections.sort(ans);
        return ans;
        
    }
    private void sorting(Node root,List<Integer> a){
        if(root==null)return;
        
        sorting(root.left,a);
        a.add(root.data);
        sorting(root.right,a);
    }
    
}
