class Solution {
   public int maxWater(int arr[]) {
        int n = arr.length;

        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = 0;
        int max = 0;
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(max, arr[i - 1]);
            max = lMax[i];
        }

        rMax[n - 1] = 0;
        max = 0;
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i + 1], max);
            max = rMax[i];
        }

        int maxWater = 0;

        for (int i = 1; i <= n - 1; i++) {
            if (Math.min(lMax[i], rMax[i]) - arr[i] > 0) {
                maxWater += (Math.min(lMax[i], rMax[i]) - arr[i]);
            }

        }

        return maxWater;
    }


}
