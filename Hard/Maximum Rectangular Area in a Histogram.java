class Solution

{
    
    private static class Pair{
        long first;
        long second;
        
        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
    public static long[] getLeftNSL(long[] hist, long n) {
        long[] left = new long[(int) n];
        Stack<Pair> NSL = new Stack<>();
        int k = 0;
        
        for (int i = 0; i < n; i++) {
            while (!NSL.isEmpty() && NSL.peek().first >= hist[i]) {
                NSL.pop();
            }
            
            if (!NSL.isEmpty()) left[k] = NSL.peek().second; 
            else left[k] = -1;
            k++;
            
            NSL.push(new Pair(hist[i], i));
        }
        
        return left;
    }
    
    public static long[] getRightNSR(long[] hist, long n) {
        long[] right = new long[(int) n];
        Stack<Pair> NSR = new Stack<>();
        int k = (int)n - 1;
        
        for (int i = (int)(n - 1); i >= 0; i--) {
            while (!NSR.isEmpty() && NSR.peek().first >= hist[i]) {
                NSR.pop();
            }
            
            if (!NSR.isEmpty()) right[k] = NSR.peek().second; 
            else right[k] = n;
            k--;
            
            NSR.push(new Pair(hist[i], i));
        }
        
        return right;
    }
    
    
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        
        long[] right = getRightNSR(hist, n);
        long[] left = getLeftNSL(hist, n);
        
        long maxArea = Long.MIN_VALUE;
        
        
        for (int i = 0; i < n; i++) {
            long width = right[i] - left[i] - 1;
            
            long area = width * hist[i];
            
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
        
}
