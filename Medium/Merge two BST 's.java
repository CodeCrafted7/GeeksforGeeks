// User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

*/
class Solution {
    
    void help(Node root,List<Integer> temp){
        if(root == null)
            return;
        help(root.left,temp);
        temp.add(root.data);
        help(root.right,temp);
    }
    
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> ans  = new ArrayList<>();
        List<Integer> f  = new ArrayList<>();
        List<Integer> s  = new ArrayList<>();
        help(root1,f);
        help(root2,s);
        int i=0,j=0;
        while(i<f.size() && j<s.size()){
            if(f.get(i) <= s.get(j)) ans.add(f.get(i++));
            else ans.add(s.get(j++));
        }
        while(i<f.size()) ans.add(f.get(i++));
        while(j<s.size()) ans.add(s.get(j++));
        return ans;
    }
}
