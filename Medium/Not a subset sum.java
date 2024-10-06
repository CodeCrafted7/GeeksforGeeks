class Solution {
    public long findSmallest(int[] arr) {
        long ans = 1;
        for(int x:arr){
            if(x>ans) return ans;
            ans += x;
        }
        return ans;
    }
}
