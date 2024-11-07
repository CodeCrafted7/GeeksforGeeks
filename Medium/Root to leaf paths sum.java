
/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class Solution {
    public static int treePathsSum(Node root) {
        return dfs(root, 0);
    }

    private static int dfs(Node root, int x) {
        if (root == null) return 0;
        x = x * 10 + root.data;
        if (root.left == null && root.right == null) return x;
        return dfs(root.left, x) +dfs(root.right, x);
    }
}
