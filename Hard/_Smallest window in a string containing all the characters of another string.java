class Solution {
    public static String smallestWindow(String s, String p) {
        int minLen = Integer.MAX_VALUE;
        int sind = -1;
        int r = 0, l = 0;
        int[] mp = new int[256];

        for (int i = 0; i < p.length(); i++)
            mp[p.charAt(i)]++;

        int cnt = 0;
        while (r < s.length()) {
            if (mp[s.charAt(r)] > 0)
                cnt++;
            mp[s.charAt(r)]--;

            while (cnt == p.length()) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    sind = l;
                }
                mp[s.charAt(l)]++;
                if (mp[s.charAt(l)] > 0)
                    cnt--;
                l++;
            }
            r++;
        }

        return sind == -1 ? "-1" : s.substring(sind, sind + minLen);
    }
}
