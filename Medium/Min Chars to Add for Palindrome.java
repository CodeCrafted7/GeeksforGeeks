
class Solution {
    public static int minChar(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        String newStr = s + "$" + rev;
        int lpsLen = lps(newStr);
        return n - lpsLen;
    }
    
    public static int lps(String s){
        int n = s.length();
        int lps[]  = new int[n];
        int len = 0,i = 1;
        while(i<n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len-1];
                }else{
                    len = 0;
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return len;
    }
}
