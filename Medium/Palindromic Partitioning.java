class Solution{
    
    static boolean isPalidrome(String str,int i,int j)
    {
        
        if(i>=j)
        {
            return true;
        }
        while(i<=j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    static int minPartition(String str,int i,int j,int dp[][],int mini)
    {
        if(i>=j)
        {
            return 0;
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        else if(isPalidrome(str,i,j) == true)
        {
            dp[i][j] = 0;
            return 0;
        }
        
        for(int k = i;k<=j-1;k++)
        {
            int left;
            if(dp[i][k] != -1)
            {
              left = dp[i][k];
            }
            else
            {
               left = minPartition(str,i,k,dp,mini);
               dp[i][k] = left;
            }
            int right;
            if(dp[k+1][j] != -1)
            {
               right = dp[k+1][j];
            }
            else
            {
               right = minPartition(str,k+1,j,dp,mini);
               dp[k+1][j] = right;
            }
            int tempans = left + right + 1;
            if(mini > tempans)
            {
                mini = tempans;
            }
        }
        
        dp[i][j] = mini;
        return mini;
    }
    static int palindromicPartition(String str)
    {
        int mini = Integer.MAX_VALUE;
        int size = str.length();
        int dp[][] = new int[size+1][size+1];
       
         for(int i =0;i<size+1;i++)
        {
            for(int j =0;j<size+1;j++)
            {
                dp[i][j] = -1;
            }
        }
        return minPartition(str,0,size-1,dp,mini);
    }
}
