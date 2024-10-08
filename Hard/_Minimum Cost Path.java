
class Solution
{
   
    public int minimumCostPath(int[][] grid)
    {
        int n=grid.length,dis[][]=new int[n][n];
        int dir[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> pq=new PriorityQueue<>((x,y)->x[0]-y[0]);
        for(int[] d:dis) Arrays.fill(d,Integer.MAX_VALUE);
        dis[0][0]=grid[0][0];
        pq.add(new int[]{dis[0][0],0,0});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int cd=curr[0],ci=curr[1],cj=curr[2];
            if(ci==n-1 && cj==n-1) return cd;
            for(int[] d:dir){
                int ni=ci+d[0],nj=cj+d[1];
                if(ni<0 || nj<0 || ni==n || nj==n) continue;
                int newCost=cd+grid[ni][nj];
                if(newCost<dis[ni][nj]){
                    dis[ni][nj]=newCost;
                    pq.add(new int[]{newCost,ni,nj});
                }
            }
        }
        return dis[n-1][n-1];
    }
}
