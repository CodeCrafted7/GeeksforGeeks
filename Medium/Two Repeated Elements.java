class Solution {
    public int[] twoRepeated(int arr[], int n) {
        int[] ans = new int[2];
        int index = 0;
        int[] freq = new int[n+1];
        for (int i = 0; i < n+2; i++) {
            freq[arr[i]]++;
            if (freq[arr[i]] > 1) {
                ans[index++] = arr[i];
            }
        }
        return ans;
    }
}
