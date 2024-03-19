
//User function Template for Java

/*
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
class Solution
{
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<Integer> res=new ArrayList<>();
        ArrayDeque<Node> q=new ArrayDeque<>();
        q.addLast(root);
        while(q.size()!=0){
            
            Node node=q.pop();
            if(node.left!=null)
                q.add(node.left);
           if(node.right!=null)
                q.add(node.right);
           res.add(node.data);
        }
        
       return res;
    }
}





