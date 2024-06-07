class Solution {
    long max_sum(int a[], int n) {
        long curr = 0;
        long total = 0;

        // Calculate the initial curr and total
        // curr is the sum of i * a[i] for i in [0, n-1]
        // total is the sum of all elements in an array a
        for (int i = 0; i < n; i++) {
            curr += (long)i * a[i];
            total += a[i];
        }

        long maxVal = curr;

        // Iterate over the array to calculate the maximum value of the rotation sum
        // The rotation formula used is:
        // curr_new = curr_old + total - n * a[n-i]
        // where curr_old is the previous rotation sum and curr_new is the current rotation sum
        for (int i = 1; i < n; i++) {
            curr += total - (long)n * a[n - i];
            if (curr > maxVal) {
                maxVal = curr;
            }
        }

        return maxVal;
        // Your code here
    }
}
