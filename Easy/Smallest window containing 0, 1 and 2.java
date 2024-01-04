
// User function Template for Java

class Solution {
   public int smallestSubstring(String S) {
        int ans = -1,n = S.length();
        int zeroidx=-1,oneidx=-1,twoidx=-1;
        for(int i=0;i<n;i++){
            if(S.charAt(i)=='0') zeroidx = i;
            if(S.charAt(i)=='1') oneidx = i;
            if(S.charAt(i)=='2') twoidx = i;
            if(zeroidx!=-1 && oneidx!=-1 && twoidx!=-1){
                int min = Math.min(Math.min(zeroidx,oneidx),twoidx);
                int max = Math.max(Math.max(zeroidx,oneidx),twoidx);
                ans = ans==-1 ? max-min+1 : Math.min(ans,max-min+1);
            }
        }
        return ans;
    }
};
