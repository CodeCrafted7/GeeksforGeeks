class Solution{
    static int solve(int m, int n,int dp[][]){
        if(n==0)return 1;
        if(m==0)return 0;
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        dp[m][n] =  solve(m/2,n-1,dp)+solve(m-1,n,dp);
        return dp[m][n];
    }
   static int numberSequence(int m, int n){
        // code here
        int dp [][] = new int[m+1][n+1];
        for(int a [] : dp){
            Arrays.fill(a,-1);
        }
        return solve(m,n,dp);
    }
}
