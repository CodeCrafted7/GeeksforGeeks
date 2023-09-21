class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code 
         int dp[] = new int[A.length()];
         int t=0;
         for(int i=0;i<dp.length;i++){
             for(int j=0;j<=i;j++){
                 String check = A.substring(j,i+1);
                 if(B.contains(check)){
                     if(j>0){
                         dp[i] += dp[j-1];
                     }
                     else{
                         dp[i]+=1;
                     }
                 }
             }
         }
        return dp[A.length()-1]>0?1:0;
    }

    }
