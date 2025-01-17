class Solution {
    public int maxLen(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ans = 0,sum = 0;
        
        for(int i=0;i<n;i++){
            sum += arr[i] == 1 ? 1 : -1;
            if(map.containsKey(sum))
                ans = Math.max(ans, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return ans;
    }
}
