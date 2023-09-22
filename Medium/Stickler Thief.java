class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp   = new int[n+1];
        Arrays.fill(dp,-1);
         return  f(0,arr,n,dp);
    }
    static int f(int ind,int arr[],int n,int dp[])
    {
        if(ind>=n) return 0;
        if(dp[ind]!=-1)  return dp[ind];
        
        int p = arr[ind]+f(ind+2,arr,n,dp);
        int np = f(ind+1,arr,n,dp);
        
        return dp[ind] = Math.max(p,np);
    }
}
