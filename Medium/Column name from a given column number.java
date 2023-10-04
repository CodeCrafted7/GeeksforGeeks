class Solution
{
    String colName (long n) {
        n = n-1;
        StringBuilder ans = new StringBuilder();
        
        while(n >= 1) {
            ans.append((char)((int)(n%26) + 'A'));
            n = (n/26)-1;
        }
        if(n == 0) ans.append((char)((int)(n%26) + 'A'));
        return ans.reverse().toString();
    }
}
