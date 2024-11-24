class Solution {
    public int getMinDiff(int k, int[] arr) {
       
       int n = arr.length;  
       if(n==1) return 0;
       
       Arrays.sort(arr);
       int ans = arr[n-1] - arr[0];
       
       for(int i=0;i<n-1;i++){
           
           int mini = Math.min(arr[i+1]-k, arr[0]+k);
           int maxi = Math.max(arr[n-1]-k, arr[i]+k);
           ans = Math.min(ans,Math.abs(maxi - mini));
           
       }
       
       return ans;
    }
}
