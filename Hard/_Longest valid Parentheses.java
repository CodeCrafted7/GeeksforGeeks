class Solution{
    static int maxLength(String s){
        int ans = 0;
        int open = 0, close = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') open++;
            if(s.charAt(i) == ')') close++;
            if(open == close)
                ans = Math.max(2*close,ans);
            else if(close>open){
                close = 0; open = 0; 
            }
        }
        open = 0; close = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '(') open++;
            if(s.charAt(i) == ')') close++;
            if(open == close)
                ans = Math.max(2*close,ans);
            else if(open>close){
                close = 0; open = 0; 
            }
        }
        return ans;
    }
}
