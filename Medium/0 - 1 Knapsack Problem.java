
class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    public static int help(int n,int w,int wt[],int val[],int ind,int dp[][]){
        if(ind == n)return 0;
        
        if(dp[ind][w] != -1)
            return dp[ind][w];
            
        int np = 0,p=0;
        
        np = help(n,w,wt,val,ind+1,dp);
        if(w>=wt[ind]){
            p = val[ind] + help(n,w-wt[ind],wt,val,ind+1,dp);
        }
        return dp[ind][w] = Math.max(p,np);
    }
    static int knapSack(int W, int wt[], int val[]) {
        int n = wt.length;
        int dp[][] = new int[n][W+1];
        for(int temp[]:dp){
            Arrays.fill(temp,-1);
        }
        return help(n,W,wt,val,0,dp);
    }
}
