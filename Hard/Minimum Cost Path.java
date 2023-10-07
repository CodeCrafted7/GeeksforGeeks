class Solution {
    public int minimumCostPath(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];
        
        for (int[] row : ans) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        ans[0][0] = grid[0][0];
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> ans[a[0]][a[1]] - ans[b[0]][b[1]]);
        minHeap.offer(new int[]{0, 0});
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int i = curr[0];
            int j = curr[1];
            
            for (int[] dir : directions) {
                int ni = i + dir[0];
                int nj = j + dir[1];
                
                if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
                    int newCost = ans[i][j] + grid[ni][nj];
                    if (newCost < ans[ni][nj]) {
                        ans[ni][nj] = newCost;
                        minHeap.offer(new int[]{ni, nj});
                    }
                }
            }
        }
        
        return ans[n - 1][m - 1];
    }
}
