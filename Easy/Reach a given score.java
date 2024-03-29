class Geeks {
    public long count(int n){
    
       int[] a = new int[] {3,5,10};
       long[][] dp = new long[4][n+1];
       
       for(long[] ar:dp) Arrays.fill(ar,-1);
       
       for(int i=0;i<=3;i++) dp[i][0]=1;
   
       return sol(n,a,3,dp);
    }
    
    public long sol(int n, int[] a,int st,long[][] dp)
    {
        
        if(n==0) return 1;
        
        if(st==0) return 0;
        
        if(dp[st][n]!=-1) return dp[st][n];
    
        if(a[st-1]<=n) dp[st][n] = sol(n-a[st-1],a,st,dp)+sol(n,a,st-1,dp);
        else dp[st][n]= sol(n,a,st-1,dp);
        
        return dp[st][n];
    }
}
