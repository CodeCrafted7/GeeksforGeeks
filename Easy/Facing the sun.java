class Solution {
    
    public int countBuildings(int[] height) {
        int st = height[0];
        int ans = 1;
        for(int i=0;i<height.length;i++){
            if(st<height[i]){
                ans++;
                st = height[i];
            }
        }
        return ans;
    }
}
