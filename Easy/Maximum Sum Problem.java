class Solution
{
   public int maxSum(int n) 
    { 
            if(n==1||n==0)
            {
                return n;
            }
            return Math.max(maxSum(n/2)+maxSum(n/3)+maxSum(n/4),n);
    } 
}
