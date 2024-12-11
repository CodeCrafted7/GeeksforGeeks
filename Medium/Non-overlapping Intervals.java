class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        int overlapped = 0;
        int prev_end = intervals[0][1]; 
        
        for (int i = 1; i < intervals.length; i++) {
            int curr_start = intervals[i][0];
            int curr_end = intervals[i][1];
            
            if (curr_start < prev_end) {
                overlapped++;
                prev_end = Math.min(prev_end, curr_end);
            } else {
                prev_end = curr_end;
            }
        }
        return overlapped;
    }
}
