class Solution {
    static int mod = (int)1e9+7;
    static int firstElement(int n) {
        // code here
        if(n==1 || n==2)return 1;
        int a = 1;
        int b = 1;
        int res = 0;
        for(int i=2;i<n;i++){
            res = (a + b) % mod;
            a = b % mod;
            b = res % mod;
        }
        return res % mod;
    }
}
