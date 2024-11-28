class Solution {
    
    public int missingNumber(int[] arr) {
        
        Arrays.sort(arr);
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }
        int Ans = 1;
        for (int num : set) {
            if (num != Ans) {
                return Ans;
            }
            Ans++;
        }
        return Ans;
    }
}

