

class Solution
{
    public int padovanSequence(int n)
    {
        // Tabulation
        int dp[] = new int[n + 2];
        dp[0] = dp[1] = dp[2] = 1;
        
        int mod = (int) 1e9 + 7;
        for(int i = 3; i <= n; i++) 
            dp[i] = (dp[i - 2] + dp[i - 3]) % mod;
            
        return dp[n] % mod;
        
    }
}
