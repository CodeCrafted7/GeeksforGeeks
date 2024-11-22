class Solution {
    public int maximumProfit(int p[]) {
        int profit = 0;
        for(int i=0;i<p.length-1;i++){
            if(p[i+1] > p[i])
                profit += p[i+1] - p[i];
        }
        return profit;
    }
}
