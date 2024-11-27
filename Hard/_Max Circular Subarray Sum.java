class Solution {


    public int circularSubarraySum(int arr[]) {
        int s1 = 0,s2 = 0;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            s1 += arr[i];
            s2 += arr[i];
            if(s1<0) s1 = 0;
            if(s2>0) s2 = 0;
            maxi = Math.max(maxi,s1);
            mini = Math.min(mini,s2);
        }
        
        return Math.max(maxi,sum-mini);
    }
}
