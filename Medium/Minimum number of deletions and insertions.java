class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    int n = str1.length();
	    int m = str2.length();
	    int dp[][] = new int[n+1][m+1];
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=m;j++){
	            dp[i][j] = str1.charAt(i-1)==str2.charAt(j-1)?1+dp[i-1][j-1]:Math.max(dp[i-1][j],dp[i][j-1]);
	        }
	    }
	    return n+m-2*dp[n][m];
	} 
}
