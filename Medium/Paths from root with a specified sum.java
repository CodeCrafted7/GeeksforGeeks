//User function Template for Java

/*Tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
*/

class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        helper(root,sum,list,new ArrayList<Integer>());
        return list;
    }
    public static void helper(Node root,int sum, ArrayList<ArrayList<Integer>> list,ArrayList<Integer>list1)
    {
        if(root == null) return;
        
        list1.add(root.data);
        sum -= root.data;
        if(sum == 0)
        list.add(new ArrayList<>(list1));
         helper(root.left,sum,list,list1);
          helper(root.right,sum,list,list1);
          
          list1.remove(list1.size() - 1);
    }
}
