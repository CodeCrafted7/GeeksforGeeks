class Solution
{
    public static int sumOfLeafNodes(Node root)
    {
        int sum[] = {0};
        helper(root, sum);
        return sum[0];
    }
    public static void helper(Node root,int sum[]) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            sum[0] += root.data;
        }
        helper(root.left,sum);
        helper(root.right,sum);
        return;
    }
}
