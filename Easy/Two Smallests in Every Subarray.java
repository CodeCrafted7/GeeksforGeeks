
class Solution {
    public int pairWithMaxSum(int[] arr) {
            int n = arr.length;
            int ans = -1;
            for (int i = 0; i < n - 1; i++) {
            int sum = arr[i] + arr[i + 1];
           ans = Math.max(sum, ans); 
            
            } return ans;
    }
}
