

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int maxi = Integer.MIN_VALUE;
        int[][]dp = new int[n][m];
        for(int[]row:dp) Arrays.fill(row,-1);
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,solve(i,m-1,M,dp));
        }
        return maxi;
    }
    static int solve(int i, int j, int[][]M,int[][]dp){
        int n = M.length;
        int m = M[0].length;
        if(i<0 || i>=n) return Integer.MIN_VALUE;
        if(j==0) return M[i][0];
        if(dp[i][j]!=-1) return dp[i][j];
        int left = M[i][j]+solve(i,j-1,M,dp);
        int leftup = M[i][j]+solve(i-1,j-1,M,dp);
        int leftdn = M[i][j]+solve(i+1,j-1,M,dp);
        return dp[i][j] = Math.max(left,Math.max(leftup,leftdn));
    }
}
