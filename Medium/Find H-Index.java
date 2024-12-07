class Solution {
    
    public int hIndex(int[] c) {
        int n = c.length;
        int bucket[] = new int[n+1];
        
        for(int x : c)
            bucket[Math.min(x,n)]++;
            
        int count = 0;
        for(int i=n;i>=0;i--){
            count += bucket[i];
            
            if(count >= i)
                return i;
        }
        return 0;
    }
}
