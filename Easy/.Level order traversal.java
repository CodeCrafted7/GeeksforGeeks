class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList();
            
            while(size-- > 0){
                Node temp = q.poll();
                level.add(temp.data);
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
