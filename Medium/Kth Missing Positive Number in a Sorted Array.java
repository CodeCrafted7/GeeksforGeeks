class Solution {
    public int kthMissing(int[] arr, int k) {
    
        int cnt = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        
        for(int i = 1; i <= Integer.MAX_VALUE; i++){
            if(!set.contains(i)){
                ++cnt;
                if(cnt == k){
                    return i;
                }
            }
        }
        return -1;
    }
}
