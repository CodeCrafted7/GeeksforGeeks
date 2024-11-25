class Solution {

    int maxSubarraySum(int[] arr) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int x : arr){
            sum += x;
            
            if(sum > maxi)  maxi = sum;
            if(sum < 0) sum = 0;
        }
        return maxi;
    }
}
