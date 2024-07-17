class Solution {
    public String printString(String s, char ch, int count) {
        int i=0;
        for(i=0;i<s.length();i++)
        {
            if(ch==s.charAt(i))
                count--;
            if(count==0)
                break;
        }
        if(i>=s.length()-1)
            return "";
        s = s.substring(i+1);
        return s;
    }
}
