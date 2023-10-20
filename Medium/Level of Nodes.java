

class Solution {
    // Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X) {
        boolean visited[] = new boolean[V];
        int levels = 0; // Initialize levels to 0.
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int size = q.size();
            while(size-->0) {
                int currNode = q.poll();
                if (currNode == X) {
                    return levels;
                }
                for (int nbr : adj.get(currNode)) {
                    if (!visited[nbr]) {
                        visited[nbr] = true;
                        q.add(nbr);
                    }
                }
            }
            levels++; // Increase levels after processing the current level.
        }
        return -1;
    }
}
