class Solution {
    static String armstrongNumber(int n){
        // code here
        String str=n+"";
        int sum=0;
        for(char ch : str.toCharArray())
            sum+=Math.pow(ch-'0',3);
        return sum==n ? "Yes" : "No";
    }
}
