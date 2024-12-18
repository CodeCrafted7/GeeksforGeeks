class Solution {
    static boolean checkAns(int[] stalls,int mid,int k) {
        int mark = stalls[0] + mid;
        for(int stall : stalls) {
            if(stall >= mark) {
                --k; mark = stall + mid;
            }
        }
        return k <= 1;
    }
    static int getPossibleAns(int[] stalls,int k) {
        int min = Arrays.stream(stalls).min().getAsInt();
        int max = Arrays.stream(stalls).max().getAsInt();
        int low = 0;
        int high = max - min;
        int ans = -1;
        
        while(low <= high)  {
            int mid = low + (high - low) / 2;
            if(checkAns(stalls,mid,k)) {
                ans = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        return getPossibleAns(stalls,k);
    }
}
