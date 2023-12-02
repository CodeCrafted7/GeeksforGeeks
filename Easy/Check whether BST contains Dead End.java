

/*class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }*/

//Function should return true if a deadEnd is found in the bst otherwise return false.
class Solution
{
    public static boolean isDeadEnd(Node root)
    {
       return helper(root, 1, Integer.MAX_VALUE);
    }
    private static boolean helper(Node node, int min, int max) {
        if (node == null) {
            return false;
        }

        if (min == max) {
            return true;
        }

        boolean left = helper(node.left, min, node.data - 1);
        boolean right = helper(node.right, node.data + 1, max);

        return left || right || (node.data == min && node.data == max);
    }
}
