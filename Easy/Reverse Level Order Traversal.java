
class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            ArrayList<Integer> levelNodes = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                levelNodes.add(current.data);

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            // Add level nodes to the front to maintain reverse order
            result.addAll(0, levelNodes);
        }

        return result;
    }

} 
