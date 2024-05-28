
class Solution {
    public static int longestSubseq(int n, int[] a) {
        int dp[] = new int[n];
        int maxi = 1;
        
        for(int i = 0; i < n; i++)
            dp[i] = 1;
        
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(Math.abs(a[i] - a[j]) == 1 & dp[i] < 1 + dp[j])
                    dp[i] = 1 + dp[j];
                    
                maxi = Math.max(maxi, dp[i]);
            }
        }
        
        return maxi;        
    }
}
