

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int sum = 0;
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            
            if(sum == k)
                ans = i+1;
            
            if(map.get(sum-k) != null){
                ans = Math.max(ans,i - map.get(sum - k));
            }
            
            if(map.get(sum) == null)
                map.put(sum,i);
        }
        return ans;
    }
}
s
