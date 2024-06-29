class Solution {
    public static String pattern(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        // Check each row for palindrome
        for (int i = 0; i < n; i++) {
            if (isPalindrome(arr[i])) {
                return i + " R";
            }
        }

        // Check each column for palindrome
        for (int j = 0; j < m; j++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = arr[i][j];
            }
            if (isPalindrome(column)) {
                return j + " C";
            }
        }

        return "-1";
    }

    private static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
