User function Template for Java

class Solution{
   static int longestcommonsubseq( String u, String v, int uu, int vv ) 
    { 
        int dp[][] = new int[uu+1][vv+1]; 
        for (int i=0; i<=uu; i++) 
        { 
            for (int j=0; j<=vv; j++) 
            { 
                if (i == 0 || j == 0) 
                    dp[i][j] = 0; 
  
                else if (u.charAt(i-1) == v.charAt(j-1)) 
                    dp[i][j] = dp[i-1][j-1] + 1; 
  
                else
                    dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]); 
            } 
        } 
        return dp[uu][vv]; 
    } 
    
    static int countMin(String str)
    {
        int n=str.length();
       StringBuffer sb = new StringBuffer(str); 
        sb.reverse(); 
        String reverse = sb.toString(); 
        return (n - longestcommonsubseq(str, reverse , n, n)); 
    }
}
