class Solution {

    int Maximize(int arr[]) {
        int n  =arr.length;
        long mod = 1000000007;
        long ans = 0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            ans+=(long)i*arr[i];
            ans%=mod;
        }
        return (int)ans;
    }
}
