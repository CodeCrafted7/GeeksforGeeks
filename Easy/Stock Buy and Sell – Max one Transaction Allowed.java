
class Solution {
    public int maximumProfit(int prices[]) {
        int maxi = 0;
        int profit = 0;
        for(int i=prices.length-1;i>=0;i--){
            maxi  = Math.max(maxi,prices[i]);
            profit = Math.max(profit, maxi-prices[i]);
        }
        return profit;
    }
}
