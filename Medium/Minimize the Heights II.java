
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int maxi = arr[n - 1], mini = arr[0], res = arr[n - 1] - arr[0];
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - k < 0)
                continue;
                
            mini = Math.min(arr[0] + k, arr[i + 1] - k);
            maxi = Math.max(arr[i] + k, arr[n - 1] - k); 
            
            res = Math.min(res, maxi - mini);
        }
        
        return res;
    }
}
