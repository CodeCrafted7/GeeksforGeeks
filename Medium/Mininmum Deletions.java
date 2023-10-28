

class Solution{
    static int minimumNumberOfDeletions(String S) {
        //your code here
        int n = S.length();
        int[] dp = new int[n+1];
        for(int i = 1; i<=n; i++){
            int[] temp = new int[n+1];
            for(int j = 1; j<=n; j++){
                if(S.charAt(i-1) == S.charAt(n-j))
                    temp[j] = 1 + dp[j-1];
                else
                    temp[j] = Math.max(dp[j], temp[j-1]);
            }
            dp = temp;
        }
        return n - dp[n];
    }
}
