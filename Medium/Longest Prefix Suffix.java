class Solution {
    int lps(String s) {
        // code here
        
        int i=1;
        int len=0;
        
        int n=s.length();
        int ans[]= new int[n];
        
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(len))
            {
                len++;
                ans[i]=len;
                i++;
            }
            else if(len==0)
            {
                // i=0;
                i++;
            }
            else
            {
                len=ans[len-1];
            }
        }
        
        // System.out.println(Arrays.toString(ans));
        
        
        return ans[n-1];
    }
}
