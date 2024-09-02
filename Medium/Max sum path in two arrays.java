class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int n = arr1.size();
        int m = arr2.size();
        int i = n - 1, j = m - 1;
        int sum1 = 0, sum2 = 0;
        
        while (i >= 0 && j >= 0) {
            if (arr1.get(i) > arr2.get(j)) {
                sum1 += arr1.get(i);
                i--;
            } else if (arr1.get(i) < arr2.get(j)) {
                sum2 += arr2.get(j);
                j--;
            } else {
                int maxSum = Math.max(sum1, sum2) + arr1.get(i);
                sum1 = maxSum;
                sum2 = maxSum;
                i--;
                j--;
            }
        }
        
        while (i >= 0) {
            sum1 += arr1.get(i);
            i--;
        }
        
        while (j >= 0) {
            sum2 += arr2.get(j);
            j--;
        }
        
        return Math.max(sum1, sum2);
    }
}
