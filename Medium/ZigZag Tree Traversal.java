class GFG {
    // Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null)
            return arr;

        boolean normal = true;
        Deque<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int currLength = q.size();
            for (int i = 0; i < currLength; i++) {
                if (normal) {
                    Node current = q.poll();
                    arr.add(current.data);

                    if (current.left != null)
                        q.offer(current.left);
                    if (current.right != null)
                        q.offer(current.right);
                } else {
                    Node current = q.pollLast();
                    arr.add(current.data);

                    if (current.right != null)
                        q.addFirst(current.right);
                    if (current.left != null)
                        q.addFirst(current.left);
                }
            }
            normal = !normal;
        }
        return arr;
    }
}
