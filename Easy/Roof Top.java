class Solution {
   
    public int maxStep(int arr[]) {
        int count = 0,ans = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) count++;
            else{
                ans = Math.max(ans,count);
                count = 0;
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
}
