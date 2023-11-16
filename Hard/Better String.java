class Solution {
    public static String betterString(String str1, String str2) {
        // Code here
         int count1 = countDistinctSubsequences(str1);
        int count2 = countDistinctSubsequences(str2);

        if (count1 >= count2) {
            return str1;
        } else {
            return str2;
        }
    }

    private static int countDistinctSubsequences(String str) {
        int n = str.length();
        int[] lastOccurrence = new int[256];
        Arrays.fill(lastOccurrence, -1);

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % 1000000007;

            if (lastOccurrence[str.charAt(i - 1)] != -1) {
                dp[i] = (dp[i] - dp[lastOccurrence[str.charAt(i - 1)] - 1] + 1000000007) % 1000000007;
            }

            lastOccurrence[str.charAt(i - 1)] = i;
        }

        return dp[n];
    }
}
