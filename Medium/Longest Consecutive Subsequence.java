class Solution {

    public int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        
        for(int x : arr){
            set.add(x);
        }
        
        int ans = 0;
        for(int x : arr){
            int curr = 0,tmp = x,tmp2 = x-1;
            if(set.contains(x)){
                while(set.contains(tmp)){
                    curr++;
                    set.remove(tmp);
                    tmp++;
                }
                
                while(set.contains(tmp2)){
                    curr++;
                    set.remove(tmp2);
                    tmp2--;
                }
            }
            ans = Math.max(ans,curr);
        }
        
        return ans;
    }
}
