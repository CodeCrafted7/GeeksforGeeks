


class Solution {
    public String smallestNumber(int s, int d) {
        StringBuilder ans = new StringBuilder();
        int i=1;
        while(i<=d)
        {
            int num = s-(d-i)*9<=0 ? 0 : s-(d-i)*9;
            if(num>9) return "-1";
            if(num==0 && i==1) num=1;
            ans.append((char)(num+'0'));
            s-=num;
            i++;
        }
        return ans.toString();
    }
}
