class Solution {
    public int maxWater(int arr[]) {
        
        int i = 0 ,j = arr.length-1,ans = 0;
        
        while(i<j){
            int curr = Math.min(arr[i],arr[j])*(j-i);
            ans = Math.max(ans, curr);
            
            if(arr[i] < arr[j]) i++;
            else j--;
        }
        
        return ans;
        
    }
}
