
class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==1) {
                    q.add(new Pair(i,j));
                    visited[i][j] = 1;
                }
            } 
        }
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        while(!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            
            for(int i=0;i<4;i++) {
                int nrow = row + delRow[i];
                int mcol = col + delCol[i];
                if(nrow>=0 && nrow<n && mcol>=0 && mcol<m && visited[nrow][mcol]==0 && grid[nrow][mcol]==1) {
                    q.add(new Pair(nrow,mcol));
                    visited[nrow][mcol] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j]==1 && visited[i][j]==0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
