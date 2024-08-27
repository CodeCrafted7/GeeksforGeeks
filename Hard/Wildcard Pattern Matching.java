class Solution {
    public static int help(String pat,String str,int i,int j,int dp[][]){
            if(i == pat.length() && j == str.length())  return 1;
            if(i == pat.length())   return 0;
            if(j == str.length() && pat.charAt(i) == '*')   return help(pat,str,i+1,j,dp);
            if(j == str.length())   return 0;
            if(pat.charAt(i) != '?' && pat.charAt(i) != '*' && pat.charAt(i) != str.charAt(j))
                return 0;
            if(dp[i][j] != -1)
                return dp[i][j];
            
            
            int a=0,b=0,c=0;
            if(pat.charAt(i) == '*'){
                a = help(pat,str,i+1,j,dp);
                b = help(pat,str,i,j+1,dp);
            }
            c = help(pat,str,i+1,j+1,dp);
            return dp[i][j] = a|b|c;
        }
    
    public int wildCard(String pattern, String str) {
        int dp[][] = new int[pattern.length()][str.length()];
        for(int temp[]:dp)
            Arrays.fill(temp,-1);
        return help(pattern,str,0,0,dp);
    }
}
