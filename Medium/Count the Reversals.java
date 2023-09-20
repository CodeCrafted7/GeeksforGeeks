class Sol
{
    int countRev (String s)
    {
        // your code here   
        if(s.length()%2!=0) return -1;
        int left=0;
        int right =0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                left++;
            }
            else{
                if(left==0)
                    right++;
                else
                    left--;
            }
        }
        res=(int)Math.round((0.0+left)/2)+(int)Math.round((0.0+right)/2);
        return res;
    }
}
