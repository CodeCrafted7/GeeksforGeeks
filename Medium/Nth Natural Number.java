class Solution {
    long findNth(long n) {
        long start = n;
        StringBuilder ans = new StringBuilder();
        while (start > 0) {
            long rem = start % 9;
            ans.append(rem);
            start /= 9;
        }
        ans.reverse();
        return Long.parseLong(ans.toString());
    }
}
