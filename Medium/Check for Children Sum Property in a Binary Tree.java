
//User function Template for Java


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Solution
{
    public static int check(Node root){
       if (root == null)
            return 1;
        
        if (root.left == null && root.right == null)
            return 1;
        
        int childrenSum = 0;
     

  if (root.left != null)
            childrenSum += root.left.data;
        if (root.right != null)
            childrenSum += root.right.data;
        
        if (root.data != childrenSum)
            return 0; 
        
       
        return check(root.left) & check(root.right);
        
    }
    public static int isSumProperty(Node root)
    {
      return check(root);
          }
}
