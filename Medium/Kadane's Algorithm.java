class Solution {

    int maxSubarraySum(int[] arr) {

        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum += arr[i];
            maxi = Math.max(maxi,sum);
            if(sum < 0) sum = 0;
        }
        return maxi;
    }
}
