
class Solution {
    int getHeight(Node root) {
        if (root == null) return 0;
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }

    boolean dfs(Node root, int level, int maxLevel) {
        if (root == null) {
            return true;
        }
        
        if (root.left == null && root.right == null && level != maxLevel) {
            return false;
        }

        boolean leftChild = dfs(root.left, level + 1, maxLevel);
        boolean rightChild = dfs(root.right, level + 1, maxLevel);
        
        if (!leftChild || !rightChild) return false;
        
        return true;
    }

    boolean check(Node root) {
        int height = getHeight(root);
        return dfs(root, 1, height);
    }
}
