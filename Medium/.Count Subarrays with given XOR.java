class Solution {
    public long subarrayXor(int arr[], int k) {
       HashMap<Integer, Integer> mp = new HashMap<>();
        int xor = 0; 
        long cnt = 0; 
        mp.put(0, 1); 

        for (int a : arr) {
            xor = xor ^ a; 
            if (mp.containsKey(xor ^ k)) {
                cnt += mp.get(xor ^ k); 
            }

            mp.put(xor, mp.getOrDefault(xor, 0) + 1); 
        }

        return cnt; 


    }
}
